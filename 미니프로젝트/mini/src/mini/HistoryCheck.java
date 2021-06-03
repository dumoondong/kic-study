package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HistoryCheck extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoryCheck frame = new HistoryCheck();
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
	public HistoryCheck() {
		setTitle("내역 조회");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 739, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"년"}));
		comboBox.setBounds(12, 10, 82, 23);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"월"}));
		comboBox_1.setBounds(126, 10, 82, 23);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"일"}));
		comboBox_2.setBounds(239, 10, 82, 23);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(618, 10, 97, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtrid = new JTextArea();
		txtrid.setText("주문자ID\t\t메인\t\t\t개수\t\t사이드\t\t개수\t\t총액");
		txtrid.setBounds(12, 43, 703, 371);
		contentPane.add(txtrid);
		
		JButton btnNewButton_1 = new JButton("닫기");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HistoryCheck.this.dispose();
			}
		});
		btnNewButton_1.setBounds(509, 10, 97, 23);
		contentPane.add(btnNewButton_1);
	}

}
