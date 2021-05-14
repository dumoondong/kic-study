package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx01 extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx01 frame = new JFrameEx01();
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
	public JFrameEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setValue(70);
		progressBar.setStringPainted(true);
		progressBar.setBounds(12, 10, 575, 17);
		contentPane.add(progressBar);
		
		JButton btn1 = new JButton("감소");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(progressBar.getValue());
				if(progressBar.getValue() <= 0) {
					JOptionPane.showMessageDialog(JFrameEx01.this, "감소 끝");
				}else {
					progressBar.setValue(progressBar.getValue()-10);
				}
			}
		});
		btn1.setBounds(12, 37, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("증가");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(progressBar.getValue());
				if(progressBar.getValue() >= 100) {
					JOptionPane.showMessageDialog(JFrameEx01.this, "증가 끝");
				}else {
					progressBar.setValue(progressBar.getValue()+10);
				}
			}
		});
		btn2.setBounds(490, 37, 97, 23);
		contentPane.add(btn2);
	}
}
