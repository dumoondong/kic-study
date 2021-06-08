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

import managerUI.ManagerMain;
import miniDB.MainMenuDAO;
import miniDB.MainMenuTO;
import miniDB.MainTable;
import miniDB.OrderDAO;
import miniDB.OrderTO;
import miniDB.SideMenuDAO;
import miniDB.SideMenuTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerMain extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	DefaultTableModel model;
	DefaultTableModel model2;
	private String Loginid= LoginMain.id;
	private JTextField textField;
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
		setBounds(700, 370, 829, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(12, 10, 509, 23);
		contentPane.add(comboBox1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 43, 509, 157);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"메인","가격"};
		final Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btn2 = new JButton("추가");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMain = (String) comboBox1.getSelectedItem();
				MainMenuDAO dao = new MainMenuDAO();
				OrderDAO dao2 = new OrderDAO();
				ArrayList<MainMenuTO> mains = dao.searchMain(strMain);
				if(strMain == "메인") {
					JOptionPane.showMessageDialog(CustomerMain.this, "메인을 선택해주세요",
							"에러메시지", JOptionPane.WARNING_MESSAGE);
				}else {
					for(MainMenuTO to : mains) {
						String main = String.format("%s", to.getMainprice());
						row[0] = strMain;
						row[1] = main;
						String strId = Loginid;
						ArrayList<OrderTO> mains2 = dao2.OrderMain(strId,strMain,main);
					}
					model.addRow(row);
					comboBox1.setSelectedItem("메인");
				}
			}
		});
		btn2.setBounds(315, 210, 97, 23);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("메뉴판");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu main = new Menu();
				main.setVisible(true);	
			}
		});
		btn1.setBounds(558, 50, 243, 59);
		contentPane.add(btn1);
		
		JButton btn2_1 = new JButton("삭제");
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btn2_1.setBounds(424, 210, 97, 23);
		contentPane.add(btn2_1);
		
		JButton btn3 = new JButton("주문조회");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderQuery main = new OrderQuery();
				main.setVisible(true);	
			}
		});
		btn3.setBounds(558, 141, 243, 59);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("주문");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				String result1 = "";
				String result2 = "";
				String result3 = "";
				String result4 = "";
		    	String strId = Loginid;
				ArrayList order = new ArrayList();
				OrderDAO dao = new OrderDAO();
				ArrayList<OrderTO> mains = dao.Orderlist(strId);
				OrderDAO dao2 = new OrderDAO();
				ArrayList<OrderTO> mains2 = dao2.SideOrderlist(strId);
				order.add("------------메인------------");
				
				for(OrderTO to : mains) {
					String main = String.format("%s       %s",to.getMain(), to.getMaintotalprice());
					result += Integer.parseInt(to.getMaintotalprice());
					result1 = to.getMain();
					result2 = to.getMaintotalprice();
					order.add(main);
				}
				order.add("----------사이드-----------");
				for(OrderTO to : mains2) {
					String main = String.format("%s          %s",to.getSide(), to.getSidetotalprice());
					result += Integer.parseInt(to.getSidetotalprice());
					result3 = to.getSide();
					result4 = to.getSidetotalprice();
					order.add(main);
				}		
				order.add("------------총액------------");
				order.add("               "+result + "\n주문하시겠습니까?");
			    int data = JOptionPane.showConfirmDialog(CustomerMain.this,order.toArray(),"주문",JOptionPane.YES_NO_OPTION);
			    if(data == 0) { //yes버튼
			    	OrderDAO dao3 = new OrderDAO();
					ArrayList<OrderTO> mains3 = dao3.DeleteOrderlist(strId);
					
					
					OrderTO to = new OrderTO();
					to.setId(strId);
					to.setMain(result1);
					to.setMaintotalprice(result2);
					to.setSide(result3);
					to.setSidetotalprice(result4);
					OrderDAO dao4 = new OrderDAO();
					ArrayList<OrderTO> mains4 = dao4.OrderQuery(to);
					
					CustomerMain.this.dispose();	
					CustomerMain main = new CustomerMain();
					main.setVisible(true);	
					
					
					
			    }else {			//아니오
			    	
			    }
			}
		});
		btn6.setBounds(558, 331, 243, 72);
		contentPane.add(btn6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 276, 509, 94);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		model2 = new DefaultTableModel();
		Object[] column2 = {"사이드","가격"};
		final Object[] row2 = new Object[2];
		model2.setColumnIdentifiers(column2);
		table_1.setModel(model2);
		scrollPane_1.setViewportView(table_1);
		
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setBounds(12, 243, 509, 23);
		contentPane.add(comboBox2);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strSide = (String)comboBox2.getSelectedItem();
				SideMenuDAO dao = new SideMenuDAO();
				OrderDAO dao2 = new OrderDAO();
				ArrayList<SideMenuTO> sides = dao.searchSide(strSide);

				if(strSide == "사이드") {
					JOptionPane.showMessageDialog(CustomerMain.this, "사이드를 선택해주세요",
							"에러메시지", JOptionPane.WARNING_MESSAGE);
				}else {
					for(SideMenuTO to : sides) {
						String side = String.format("%s", to.getSideprice());
						row2[0] = strSide;
						row2[1] = side;
						String strId = Loginid;
						ArrayList<OrderTO> mains2 = dao2.OrderSide(strId,strSide,side);
					}
					model2.addRow(row2);
					comboBox2.setSelectedItem("사이드");
				}		
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setBounds(315, 380, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				model2.removeRow(i);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.setBounds(424, 380, 97, 23);
		contentPane.add(btnNewButton_1);
				
		JButton btnNewButton_2 = new JButton("로그아웃");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMain main = new LoginMain();
				main.setVisible(true);	
				
				CustomerMain.this.dispose();	
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(704, 10, 97, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setText("클릭!");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loginid = LoginMain.id;
				textField.setText(Loginid);
			}
		});
		textField.setEditable(false);
		textField.setBounds(576, 11, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//메인 combobox 초기화
		MainMenuDAO dao = new MainMenuDAO();
		ArrayList<MainMenuTO> mains = dao.listMain();
		ArrayList<String> strMains = new ArrayList<String>();
		for(MainMenuTO to : mains) {
			strMains.add(to.getMain());
		}
		comboBox1.setModel(new DefaultComboBoxModel(strMains.toArray()));
			
		//사이드 combobox 초기화
		SideMenuDAO dao1 = new SideMenuDAO();
		ArrayList<SideMenuTO> sides = dao1.listSide();
		ArrayList<String> strSides = new ArrayList<String>();
		for(SideMenuTO to : sides) {
			strSides.add(to.getSide());
		}
		comboBox2.setModel(new DefaultComboBoxModel(strSides.toArray()));

	}
}
