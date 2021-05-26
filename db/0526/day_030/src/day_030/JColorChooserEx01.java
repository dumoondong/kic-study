package day_030;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JColorChooserEx01 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JColorChooserEx01 frame = new JColorChooserEx01();
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
	public JColorChooserEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color color = JColorChooser.showDialog(JColorChooserEx01.this, "팔레트", Color.blue);
				if(color != null) {
					System.out.println(color.toString());
					//RGB
					panel.setBackground(color);
					System.out.println(color.getRed());
					System.out.println(color.getGreen());
					System.out.println(color.getBlue());
				}
			}
		});
		btnNewButton.setBounds(12, 10, 97, 23);
		contentPane.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(12, 43, 97, 85);
		contentPane.add(panel);
	}
}
