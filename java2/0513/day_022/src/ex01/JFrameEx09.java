package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx09 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx09 frame = new JFrameEx09();
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
	public JFrameEx09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtn1 = new JRadioButton("사과");
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(8, 6, 121, 23);
		contentPane.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("참외");
		buttonGroup.add(rdbtn2);
		rdbtn2.setSelected(true);
		rdbtn2.setBounds(8, 28, 121, 23);
		contentPane.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("수박");
		buttonGroup.add(rdbtn3);
		rdbtn3.setBounds(8, 53, 121, 23);
		contentPane.add(rdbtn3);
		
		JButton btn = new JButton("클릭");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				String result = "";
				if(rdbtn1.isSelected()) {
					result += rdbtn1.getText() + "\n";
				}
				if(rdbtn2.isSelected()) {
					result += rdbtn2.getText() + "\n";
				}
				if(rdbtn3.isSelected()) {
					result += rdbtn3.getText() + "\n";
				}
				textArea.setText(result);
			}
		});
		btn.setBounds(8, 81, 447, 23);
		contentPane.add(btn);
		
		textArea = new JTextArea();
		textArea.setBounds(8, 114, 447, 173);
		contentPane.add(textArea);
	}
}
