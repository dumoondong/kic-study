package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameEx03 extends JFrame {

	private JPanel contentPane;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx03 frame = new JFrameEx03();
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
	public JFrameEx03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("활성화");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setEnabled(true);
				System.out.println("btn3 활성화");
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("상태:" + btn1.isSelected());
				System.out.println("라벨:" + btn1.getText());
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("비활성화");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3.setEnabled(true);
				System.out.println("btn3 활성화");
			}
		});
		btn2.setBounds(121, 10, 97, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("결과");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("결과 클릭"+btn3.isEnabled());
			}
		});
		btn3.setBounds(12, 61, 655, 81);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("보이기");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3.setVisible(true);
			}
		});
		btn4.setBounds(249, 10, 97, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("안보이기");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3.setVisible(false);
			}
		});
		btn5.setBounds(399, 10, 97, 23);
		contentPane.add(btn5);
	}

}
