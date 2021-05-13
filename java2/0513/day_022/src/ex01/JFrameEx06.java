package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx06 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx06 frame = new JFrameEx06();
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
	public JFrameEx06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 10, 506, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl.setText("결과 : "+capitalizeName(textField.getText()));
			}
		});
		btn.setBounds(542, 9, 97, 23);
		contentPane.add(btn);
		
		lbl = new JLabel("결과 : ");
		lbl.setBounds(12, 41, 627, 15);
		contentPane.add(lbl);
	}
	public String capitalizeName(String strName ) {
		String[] names = strName.split(" ");
		for(int i=0; i<names.length; i++) {
			names[i] = names[i].substring(0,1).toUpperCase()+names[i].substring(1);
		}
		return String.join(" ", names);
	}
}
