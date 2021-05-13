package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JList;

public class JFrameEx12 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx12 frame = new JFrameEx12();
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
	public JFrameEx12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(12, 44, 423, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("우편번호 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				if(capitalizeName(textField.getText()).length() >=2){
					textArea.append(capitalizeName(textField.getText()));
				}else {
					JOptionPane.showMessageDialog(JFrameEx12.this, "2자이상 입력");
				}
				
			}
		});
		btn.setBounds(467, 43, 97, 23);
		contentPane.add(btn);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 111, 576, 338);
		contentPane.add(textArea);
	}
	public String capitalizeName(String strName) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			String address = null;
			while((address = br.readLine())!=null) {
				//System.out.println(address);
				String[] addresses = address.split(",");
				if(addresses[3].startsWith(strName)) {
					textArea.append(address+"\n");
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
