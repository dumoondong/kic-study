package customerUI;

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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import miniDB.MainMenuDAO;
import miniDB.MainMenuTO;
import miniDB.MainTable;
import miniDB.SideMenuDAO;
import miniDB.SideMenuTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerMain extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private JTable table2;
	private JComboBox comboBox1;
	private JComboBox comboBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMain frame = new CustomerMain();
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
	public CustomerMain() {
		setTitle("고객");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 816, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("추가");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMain = (String) comboBox1.getSelectedItem();
				
				if(strMain == "메인") {
					JOptionPane.showMessageDialog(CustomerMain.this, "메인을 선택해주세요",
							"에러메시지", JOptionPane.WARNING_MESSAGE);
				}else {
					table1.setModel(new MainTable(strMain));
				}
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
							
			}
		});
		btn1.setBounds(209, 231, 113, 23);
		contentPane.add(btn1);
		
		JButton btn5 = new JButton("주문 조회");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderQuery main = new OrderQuery();
				main.setVisible(true);	
			}
		});
		btn5.setBounds(546, 62, 205, 57);
		contentPane.add(btn5);
		
		JButton btn7 = new JButton("주문");
		btn7.setBounds(543, 374, 208, 70);
		contentPane.add(btn7);
		
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
		
		JButton btn6 = new JButton("개인정보 수정");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyInfo main = new ModifyInfo();
				main.setVisible(true);	
			}
		});
		btn6.setBounds(546, 127, 205, 57);
		contentPane.add(btn6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 141, 414, 77);
		contentPane.add(scrollPane);
		
		table1 = new JTable();
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uBA54\uC778", "\uAC00\uACA9"
			}
		));
		table1.getColumnModel().getColumn(0).setPreferredWidth(200);
		table1.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane.setViewportView(table1);
		table1.setCellSelectionEnabled(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(25, 338, 413, 93);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		table2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uC0AC\uC774\uB4DC", "\uAC00\uACA9"
			}
		));
		table2.getColumnModel().getColumn(0).setPreferredWidth(200);
		table2.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane_1.setViewportView(table2);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"메인1", "메인2"}));
		comboBox1.setBounds(26, 100, 412, 23);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"사이드1", "사이드2"}));
		comboBox2.setBounds(26, 301, 412, 23);
		contentPane.add(comboBox2);
		
		JButton btn3 = new JButton("추가");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strSide = (String) comboBox2.getSelectedItem();
				
				table2.setModel(new MainTable(strSide));
			}
		});
		btn3.setBounds(209, 441, 113, 23);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("삭제");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn2.setBounds(341, 231, 97, 23);
		contentPane.add(btn2);
		
		JButton btn4 = new JButton("삭제");
		btn4.setBounds(341, 441, 97, 23);
		
		contentPane.add(btn4);
		//comboBox1 초기화
		MainMenuDAO dao = new MainMenuDAO();
		ArrayList<MainMenuTO> mains = dao.listMain();
		ArrayList<String> strMains = new ArrayList<String>();
		for(MainMenuTO to : mains) {
			strMains.add(to.getMain());
		}
		comboBox1.setModel(new DefaultComboBoxModel(strMains.toArray()));
		
		SideMenuDAO dao1 = new SideMenuDAO();
		ArrayList<SideMenuTO> sides = dao1.listSide();
		ArrayList<String> strSides = new ArrayList<String>();
		for(SideMenuTO to : sides) {
			strSides.add(to.getSide());
		}
		comboBox2.setModel(new DefaultComboBoxModel(strSides.toArray()));
	}
}
