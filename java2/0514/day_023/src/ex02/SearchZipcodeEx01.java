package ex02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;


import ex01.CustomTableModel3;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SearchZipcodeEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchZipcodeEx01 frame = new SearchZipcodeEx01();
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
	public SearchZipcodeEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638\uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 20, 624, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("동이름");
		lbl.setBounds(6, 21, 46, 15);
		panel.add(lbl);
		
		textField = new JTextField();
		textField.setBounds(54, 18, 461, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				if(capitalizeName(textField.getText()).length() >=2){
					//table.setValueAt(e,table.getRowCount(),table.getColumnCount() );
				}else {
					JOptionPane.showMessageDialog(SearchZipcodeEx01.this, "2자이상 입력");
				}
			}
		});
		btn.setBounds(515, 17, 97, 23);
		panel.add(btn);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 73, 618, 334);
		contentPane.add(scrollPane);
		
		table = new JTable();	
		table.setModel(new ZipCode());
		scrollPane.setViewportView(table);
	}
	
	public String capitalizeName(String strName) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			String address = null;
			int line = br.read();
			while((address = br.readLine())!=null) {
				String[] addresses = address.split(",");
				if(addresses[3].startsWith(strName)) {
					table.setValueAt(addresses, 0, 1);

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally{
			if(br != null)try {br.close();}catch(IOException e) {}
		}
		return String.join(" ", strName);
	}
}
