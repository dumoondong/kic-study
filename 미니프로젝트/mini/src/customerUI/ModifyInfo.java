package customerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModifyInfo extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyInfo frame = new ModifyInfo();
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
	public ModifyInfo() {
		setTitle("개인정보 수정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBounds(0, 10, 434, 182);
		contentPane.add(contentPanel);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(53, 21, 57, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("새 비밀번호");
		lblNewLabel_1.setBounds(53, 49, 72, 15);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인");
		lblNewLabel_2.setBounds(53, 80, 84, 15);
		contentPanel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 49, 168, 21);
		contentPanel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(137, 80, 168, 21);
		contentPanel.add(passwordField_1);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setBounds(53, 111, 57, 15);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("핸드폰 번호");
		lblNewLabel_4.setBounds(53, 149, 74, 15);
		contentPanel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 146, 45, 21);
		contentPanel.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setBounds(194, 149, 13, 15);
		contentPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("-");
		lblNewLabel_6.setBounds(265, 149, 13, 15);
		contentPanel.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 146, 45, 21);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(279, 146, 45, 21);
		contentPanel.add(textField_4);
		
		JLabel lblNewLabel_7 = new JLabel("ID");
		lblNewLabel_7.setBounds(137, 21, 128, 15);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("NAME");
		lblNewLabel_8.setBounds(137, 111, 57, 15);
		contentPanel.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyInfo.this.dispose();
			}
		});
		btnNewButton.setBounds(218, 228, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyInfo.this.dispose();
			}
		});
		btnNewButton_1.setBounds(325, 228, 97, 23);
		contentPane.add(btnNewButton_1);
	}
}
