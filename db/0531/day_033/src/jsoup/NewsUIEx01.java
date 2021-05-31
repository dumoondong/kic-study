package jsoup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class NewsUIEx01 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsUIEx01 frame = new NewsUIEx01();
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
	public NewsUIEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uB7AD\uD0B9\uB274\uC2A4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 21, 729, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn11 = new JButton("많이 본");
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn11.setBounds(12, 24, 165, 23);
		panel.add(btn11);
		
		JButton btn12 = new JButton("열독률 높은 뉴스");
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table.setModel( new CustomTableModel() );
			}
		});
		btn12.setBounds(193, 24, 165, 23);
		panel.add(btn12);
		
		JButton btn13 = new JButton("댓글 많은 뉴스");
		btn13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn13.setBounds(374, 24, 165, 23);
		panel.add(btn13);
		
		JButton btn14 = new JButton("연령별 인기 뉴스");
		btn14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn14.setBounds(551, 24, 165, 23);
		panel.add(btn14);
		
		JButton btn21 = new JButton("뉴스");
		btn21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn21.setBounds(12, 57, 165, 23);
		panel.add(btn21);
		
		JButton btn22 = new JButton("연예");
		btn22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn22.setBounds(193, 57, 165, 23);
		panel.add(btn22);
		
		JButton btn23 = new JButton("스포츠");
		btn23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn23.setBounds(374, 57, 165, 23);
		panel.add(btn23);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 131, 729, 321);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uCD9C\uCC98", "\uC81C\uBAA9", "\uB0B4\uC6A9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
	}
}
