

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class SearchZipcodeEx01 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JTextArea textArea;

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
		setBounds(100, 100, 548, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox1 = new JComboBox();
		comboBox1.setBounds(12, 10, 144, 28);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setBounds(168, 10, 164, 28);
		contentPane.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setBounds(344, 10, 176, 28);
		contentPane.add(comboBox3);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(12, 48, 508, 397);
		contentPane.add(textArea);
	}

}
