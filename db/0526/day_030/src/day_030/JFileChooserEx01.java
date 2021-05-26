package day_030;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class JFileChooserEx01 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx01 frame = new JFileChooserEx01();
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
	public JFileChooserEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("자바파일열기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//open/save
				JFileChooser fileChooser = new JFileChooser("c:\\");
				
				FileNameExtensionFilter fileter
					= new FileNameExtensionFilter("Java Source", "java");
				fileChooser.setFileFilter(fileter);
				
				int result = fileChooser.showOpenDialog(JFileChooserEx01.this);
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					File selectedFile = fileChooser.getSelectedFile();
					System.out.println(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
					
					BufferedReader br = null;
					textArea.setText("");
					try {
						br = new BufferedReader(new FileReader( selectedFile));
						String data = null;
						while((data = br.readLine())!= null) {
							textArea.append(data+"\n");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally {
						if(br != null)try {br.close();}catch(IOException e1) {}
					}
				}else{
					//result == JFileChooser.CANCEL_OPTION
					System.out.println("취소");
				}
				
			}
		});
		btn.setBounds(12, 10, 156, 23);
		contentPane.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 43, 733, 447);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		btn2 = new JButton("파일 저장");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// My Document 위치
				//JFileChooser fileChooser = new JFileChooser();
				//특정 위치
				JFileChooser fileChooser = new JFileChooser("c:\\");
				int result = fileChooser.showSaveDialog(JFileChooserEx01.this);
				
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println(fileChooser.getSelectedFile().getName());
					File selectedFile = fileChooser.getSelectedFile();
					BufferedWriter bw =null;
					try {
						bw = new BufferedWriter(new FileWriter("test.txt", true));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally {
						if(bw != null) try { bw.close();} catch(IOException e1) {}
					}					
				}else {
					
				}
			}
		});
		btn2.setBounds(183, 10, 97, 23);
		contentPane.add(btn2);
	}
}
