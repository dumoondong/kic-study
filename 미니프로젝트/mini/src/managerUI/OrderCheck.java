package managerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderCheck extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderCheck frame = new OrderCheck();
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
	public OrderCheck() {
		setTitle("주문 확인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 785, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 616, 321);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"\uC8FC\uBB38\uC790ID", "\uBA54\uC778", "\uAC1C\uC218", "\uC0AC\uC774\uB4DC", "\uAC1C\uC218"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("확인");
		btnNewButton.setBounds(660, 13, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("닫기");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderCheck.this.dispose();
			}
		});
		btnNewButton_1.setBounds(660, 46, 97, 23);
		contentPane.add(btnNewButton_1);
	}
}
