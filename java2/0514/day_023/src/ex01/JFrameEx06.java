package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx06 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextArea textArea;

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
		setBounds(100, 100, 945, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox.setBounds(12, 10, 226, 23);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox_1.setBounds(286, 10, 244, 23);
		contentPane.add(comboBox_1);
		
		JButton btn = new JButton("출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				int dan = comboBox.getSelectedIndex()+1;
				int col = comboBox_1.getSelectedIndex()+1;
				for(int i = dan; i<=col; i++) {
					for(int j=1; j<=9; j++) {
						textArea.append(i+" * "+j+" = "+(i*j)+"\t");
					}
					textArea.append("\n\n");
				}
			}
		});
		btn.setBounds(561, 10, 97, 23);
		contentPane.add(btn);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 57, 905, 299);
		contentPane.add(textArea);
	}
}
