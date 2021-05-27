package com.exam.day_0311;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ZipcodeSearchDlgEx01 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public ZipcodeSearchDlgEx01() {
		setBounds(100, 100, 450, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(12, 10, 271, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btn = new JButton("검색");
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String strDong = textField.getText();
					if(strDong.length() <= 1) {
						JOptionPane.showMessageDialog(ZipcodeSearchDlgEx01.this, "1자이상 입력", 
								"에러메시지", JOptionPane.WARNING_MESSAGE);
					}else {
						//System.out.println(strDong);
						ArrayList<ArrayList<String>> datas = searchZipcode(strDong);
						//System.out.println(datas.size());	
						//System.out.println(Arrays.toString(datas.toArray()));
						
						//ArrayList<ArrayList<String>> => 2차 배열
						Object[][] objs = new Object[datas.size()][];
						for(int i=0; i<datas.size(); i++) {
								objs[i] = datas.get(i).toArray();
						}
					
						DefaultTableModel dfm = new DefaultTableModel(
								objs,
								new String[] {
										"\uC6B0\uD3B8\uBC88\uD638", "\uC2DC\uB3C4", "\uAD6C\uAD70", "\uB3D9", "\uB9AC", "\uBC88\uC9C0"
									});
						table.setModel(dfm);
						
					}
					
				}
			});
			btn.setBounds(295, 9, 97, 23);
			contentPanel.add(btn);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 53, 380, 315);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null},
					},
					new String[] {
						"\uC6B0\uD3B8\uBC88\uD638", "\uC2DC\uB3C4", "\uAD6C\uAD70", "\uB3D9", "\uB9AC", "\uBC88\uC9C0"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ZipcodeSearchDlgEx01.this.dispose();
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
						ZipcodeSearchDlgEx01.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	//table
	// 2차원 배열 [][]
	//[][]
	//ArrayList<ArrayList<String>>
	//ArrayList<HashMap<String,String>>
	//ArrayList<TO>
	
	public ArrayList<ArrayList<String>> searchZipcode(String strDong){
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ArrayList<String>> datas = new ArrayList();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ArrayList<String> data = new ArrayList();
				data.add(rs.getString("zipcode"));
				data.add(rs.getString("sido"));
				data.add(rs.getString("gugun"));
				data.add(rs.getString("dong"));
				data.add(rs.getString("ri"));
				data.add(rs.getString("bunji"));
				
				datas.add(data);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return datas;
	}
}
