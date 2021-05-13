package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class JFrameEx01 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;

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
		setTitle("난 프레임");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.cyan);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("난 라벨");
		lbl1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("굴림", Font.PLAIN, 16));
		lbl1.setForeground(Color.RED);
		lbl1.setBounds(129, 10, 342, 51);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("<html><body><font color='red'>Hello Label</font><br /><font color='blue'>Hello Label</font></body></html>");
		lbl2.setIcon(new ImageIcon("C:\\java\\eclipse-workspace\\day_022\\icon.png"));
		lbl2.setBounds(12, 46, 168, 83);
		contentPane.add(lbl2);
	}
}
