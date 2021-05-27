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

public class ZipcodeSearchDlgEx02 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;
	
	// return 데이터
	public String zipcode1 = "";
	public String zipcode2 = "";
	public String address = "";

	/**
	 * Create the dialog.
	 */
	public ZipcodeSearchDlgEx02() {
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
					if(strDong.length() <= 1 ) {
						JOptionPane.showMessageDialog(ZipcodeSearchDlgEx02.this, "1자이상 입력해야합니다.",
							"에러메시지", JOptionPane.WARNING_MESSAGE);
					} else {
						//System.out.println( strDong );

						//table.setModel( new CustomZipcodeTableModel(strDong) );
						table.setModel( new CustomZipcodeTableModel2(strDong) );
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
						//System.out.println(table.getSelectedRow());
						
						//System.out.println(table.getValueAt(table.getSelectedRow(), 0));
						String[] zipcodes = ((String)table.getValueAt(table.getSelectedRow(),0)).split("-");
						zipcode1 = zipcodes[0];
						zipcode2 = zipcodes[1];
						
						address = String.format("%s %s %s %s", 
								(String)table.getValueAt(table.getSelectedRow(), 1),
								(String)table.getValueAt(table.getSelectedRow(), 2),
								(String)table.getValueAt(table.getSelectedRow(), 3),
								(String)table.getValueAt(table.getSelectedRow(), 4));
						
						ZipcodeSearchDlgEx02.this.dispose();
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
						ZipcodeSearchDlgEx02.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
