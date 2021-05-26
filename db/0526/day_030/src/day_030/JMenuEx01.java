package day_030;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JMenuEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuEx01 frame = new JMenuEx01();
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
	public JMenuEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mn1 = new JMenu("menu 1");
		menuBar.add(mn1);
		
		JMenuItem mntm1 = new JMenuItem("menu item1");
		mntm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("메뉴 1 클릭");
			}
		});
		mn1.add(mntm1);
		
		JMenuItem mntm2 = new JMenuItem("menu item2");
		mntm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("메뉴 2 클릭");
			}
		});
		mn1.add(mntm2);
		
		JMenu mn2 = new JMenu("menu2");
		menuBar.add(mn2);
		
		JMenuItem mntm3 = new JMenuItem("menu item3");
		mn2.add(mntm3);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntm4 = new JMenuItem("Open");
		mntm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//open/save
				JFileChooser fileChooser = new JFileChooser("c:\\");
				
				FileNameExtensionFilter fileter
					= new FileNameExtensionFilter("Java Source", "java");
				fileChooser.setFileFilter(fileter);
				
				int result = fileChooser.showOpenDialog(JMenuEx01.this);
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					File selectedFile = fileChooser.getSelectedFile();
					System.out.println(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
					
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader( selectedFile));
						String data = null;
						while((data = br.readLine())!= null) {
							System.out.println("성공");
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
		mnNewMenu.add(mntm4);
		
		JMenuItem mntm5 = new JMenuItem("Save");
		mntm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu.add(mntm5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
