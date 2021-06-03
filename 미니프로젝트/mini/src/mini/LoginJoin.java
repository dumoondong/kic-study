package mini;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginJoin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField1;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginJoin dialog = new LoginJoin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginJoin() {
		setTitle("회원가입");
		setBounds(700, 370, 450, 254);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("아이디");
			lblNewLabel.setBounds(53, 21, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			textField1 = new JTextField();
			textField1.setBounds(137, 18, 168, 21);
			contentPanel.add(textField1);
			textField1.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("비밀번호");
			lblNewLabel_1.setBounds(53, 49, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("비밀번호 확인");
			lblNewLabel_2.setBounds(53, 80, 84, 15);
			contentPanel.add(lblNewLabel_2);
		}
		{
			passwordField = new JPasswordField();
			passwordField.setBounds(137, 49, 168, 21);
			contentPanel.add(passwordField);
		}
		{
			passwordField2 = new JPasswordField();
			passwordField2.setBounds(137, 80, 168, 21);
			contentPanel.add(passwordField2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("이름");
			lblNewLabel_3.setBounds(53, 111, 57, 15);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField2 = new JTextField();
			textField2.setBounds(137, 108, 116, 21);
			contentPanel.add(textField2);
			textField2.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("핸드폰 번호");
			lblNewLabel_4.setBounds(53, 149, 74, 15);
			contentPanel.add(lblNewLabel_4);
		}
		{
			textField3 = new JTextField();
			textField3.setBounds(137, 146, 45, 21);
			contentPanel.add(textField3);
			textField3.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("-");
			lblNewLabel_5.setBounds(194, 149, 13, 15);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("-");
			lblNewLabel_6.setBounds(265, 149, 13, 15);
			contentPanel.add(lblNewLabel_6);
		}
		{
			textField4 = new JTextField();
			textField4.setColumns(10);
			textField4.setBounds(208, 146, 45, 21);
			contentPanel.add(textField4);
		}
		{
			textField5 = new JTextField();
			textField5.setColumns(10);
			textField5.setBounds(279, 146, 45, 21);
			contentPanel.add(textField5);
		}
		{
			JButton btnNewButton = new JButton("중복 검사");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnNewButton.setBounds(325, 17, 97, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String url = "jdbc:mysql://localhost:3306/project";
						String user = "root";
						String password = "123456";
						
						Connection conn = null;
						//Statement stmt = null;
						PreparedStatement pstmt = null;
						
						try {
							Class.forName("org.mariadb.jdbc.Driver");
							conn = DriverManager.getConnection(url, user, password);
							String a = passwordField.getText();
							String b = passwordField2.getText();
							String c = textField2.getText();
							if(a.equals(b)) {
								String sql = "insert customor value (?, ?, ?, ?)";
								pstmt = conn.prepareStatement( sql );
								pstmt.setString(1,textField1.getText());
								pstmt.setString(2,passwordField.getText());
								pstmt.setString(3,textField2.getText());
								pstmt.setString(4,textField3.getText());
								
								int result = pstmt.executeUpdate();
								JOptionPane.showMessageDialog(LoginJoin.this, "회원가입 성공.");
								LoginJoin.this.dispose();
							}else {
								JOptionPane.showMessageDialog(LoginJoin.this, "비밀번호를 확인하세요.");	
								
							}
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							System.out.println("[에러]:"+e1.getMessage());
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							System.out.println("[에러]:"+e1.getMessage());
						}finally {
							if(pstmt != null)try  {pstmt.close();}catch(SQLException e1) {}
							if(conn != null)try  {conn.close();}catch(SQLException e1) {}
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginJoin.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
