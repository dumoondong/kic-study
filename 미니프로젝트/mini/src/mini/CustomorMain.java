package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class CustomorMain extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomorMain frame = new CustomorMain();
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
	public CustomorMain() {
		setTitle("고객");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 816, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("추가");
		btnNewButton_1_1.setBounds(209, 231, 113, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("주문 조회");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderQuery main = new OrderQuery();
				main.setVisible(true);	
			}
		});
		btnNewButton.setBounds(546, 62, 205, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("주문");
		btnNewButton_2.setBounds(543, 374, 208, 70);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("메뉴판");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu main = new Menu();
				main.setVisible(true);	
			}
		});
		btnNewButton_3.setBounds(26, 10, 205, 57);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("개인정보 수정");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyInfo main = new ModifyInfo();
				main.setVisible(true);	
			}
		});
		btnNewButton_5.setBounds(546, 127, 205, 57);
		contentPane.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 141, 414, 77);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uBA54\uC778", "\uAC00\uACA9"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(25, 338, 413, 93);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uC0AC\uC774\uB4DC", "\uAC00\uACA9"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(200);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane_1.setViewportView(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 100, 412, 23);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(26, 301, 412, 23);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_1_1_1 = new JButton("추가");
		btnNewButton_1_1_1.setBounds(209, 441, 113, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.setBounds(341, 231, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.setBounds(341, 441, 97, 23);
		contentPane.add(btnNewButton_4);
	}
}
