package customerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniDB.MainMenuDAO;
import miniDB.MainMenuTO;
import miniDB.SideMenuDAO;
import miniDB.SideMenuTO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea1;
	private JTextArea textArea2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("메뉴판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 669, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메뉴");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 42));
		lblNewLabel.setBounds(258, 10, 189, 40);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 87, 323, 336);
		contentPane.add(scrollPane);
		
		textArea1 = new JTextArea();
		textArea1.setEditable(false);
		scrollPane.setViewportView(textArea1);
		textArea1.setText("메뉴명\t\t\t가격\r\n");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(328, 87, 323, 336);
		contentPane.add(scrollPane_1);
		
		textArea2 = new JTextArea();
		textArea2.setEditable(false);
		scrollPane_1.setViewportView(textArea2);
		textArea2.setText("메뉴명\t\t\t가격\r\n");
		
		JLabel lblNewLabel_1 = new JLabel("메인");
		lblNewLabel_1.setBounds(116, 62, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("사이드");
		lblNewLabel_2.setBounds(452, 62, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.this.dispose();
			}
		});
		btnNewButton.setBounds(544, 432, 97, 23);
		contentPane.add(btnNewButton);
		
		MainMenuDAO dao = new MainMenuDAO();
		ArrayList<MainMenuTO> mains = dao.listMenu();
		for(MainMenuTO to : mains) {
			String main = String.format("%s\t\t\t%s\n", 
					to.getMain(),to.getMainprice());
			textArea1.append(main);
		}	
		
		SideMenuDAO dao1 = new SideMenuDAO();
		ArrayList<SideMenuTO> sides = dao1.listSideMenu();
		for(SideMenuTO to : sides) {
			String side = String.format("%s\t\t\t%s\n", 
					to.getSide(),to.getSideprice());
			textArea2.append(side);
		}
	}
}
