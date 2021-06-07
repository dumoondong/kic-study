package customerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniDB.MainMenuDAO;
import miniDB.MainMenuTO;
import miniDB.MainTable;
import miniDB.SideMenuDAO;
import miniDB.SideMenuTO;
import miniDB.SideTable;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

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
		setBounds(700, 370, 669, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메뉴판");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 42));
		lblNewLabel.setBounds(258, 10, 189, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.this.dispose();
			}
		});
		btnNewButton.setBounds(544, 432, 97, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 60, 307, 363);
		contentPane.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uBA54\uC778", "\uAC00\uACA9"
			}
		));
		scrollPane_2.setViewportView(table);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(331, 60, 310, 363);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uC0AC\uC774\uB4DC", "\uAC00\uACA9"
			}
		));
		scrollPane.setViewportView(table_1);
		//메인 테이블에 값넣기
		table.setModel(new MainTable());
		//사이드 테이블에 값넣기
		table_1.setModel(new SideTable());
	}
}
