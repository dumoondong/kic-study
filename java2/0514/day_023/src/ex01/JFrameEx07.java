package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx07 extends JFrame {

	private JPanel contentPane;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx07 frame = new JFrameEx07();
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
	public JFrameEx07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 10, 367, 312);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(list.getSelectedIndex());
				System.out.println(list.getSelectedValue());
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
//		list.setModel(new AbstractListModel() {
//			String[] values = new String[] {"사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기"};
//			public int getSize() {
//				return values.length;
//			}
//			public Object getElementAt(int index) {
//				return values[index];
//			}
//		});
		list.setModel(new CustomListModel());
		list.setSelectedIndex(6);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(list.getSelectedIndex());
				System.out.println(list.getSelectedValue());
			}
		});
		btn.setBounds(424, 8, 97, 23);
		contentPane.add(btn);
	}
}
