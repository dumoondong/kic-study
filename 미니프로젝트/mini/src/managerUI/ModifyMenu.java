package managerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import customerUI.Menu;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModifyMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyMenu frame = new ModifyMenu();
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
	public ModifyMenu() {
		setTitle("메뉴 수정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 625, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메뉴수정");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 42));
		lblNewLabel.setBounds(214, 10, 189, 40);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"메인", "사이드"}));
		comboBox.setBounds(12, 104, 101, 23);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setText("메뉴명");
		textField.setBounds(121, 104, 227, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("가격");
		textField_1.setBounds(358, 105, 93, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.setBounds(481, 104, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setBounds(481, 142, 116, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"메인"}));
		comboBox_1.setBounds(12, 142, 101, 23);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"메뉴명"}));
		comboBox_2.setBounds(121, 142, 227, 23);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setText("가격");
		textField_2.setColumns(10);
		textField_2.setBounds(358, 143, 93, 21);
		contentPane.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(481, 175, 116, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("메뉴 조회");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu main = new Menu();
				main.setVisible(true);	
			}
		});
		btnNewButton_2_1.setBounds(374, 267, 116, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("닫기");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyMenu.this.dispose();
			}
		});
		btnNewButton_3.setBounds(500, 267, 97, 23);
		contentPane.add(btnNewButton_3);
	}

}
