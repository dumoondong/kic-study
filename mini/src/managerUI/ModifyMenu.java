package managerUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import customerUI.CustomerMain;
import customerUI.LoginJoin;
import customerUI.Menu;
import customerUI.ModifyInfo;
import customerUI.OrderQuery;
import miniDB.MainMenuDAO;
import miniDB.MainMenuTO;
import miniDB.MainTable;
import miniDB.SideMenuDAO;
import miniDB.SideMenuTO;
import miniDB.SideTable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ModifyMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JComboBox comboBox3;
	private JTable table;
	private JTable table_1;
	private JComboBox comboBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyMenu frame = new ModifyMenu();
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
	public ModifyMenu() {
		setTitle("메뉴 수정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 370, 644, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메뉴수정");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 42));
		lblNewLabel.setBounds(214, 10, 189, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uCD94\uAC00", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 60, 616, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 17, 101, 23);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"메인", "사이드"}));
		
		textField1 = new JTextField();
		textField1.setBounds(115, 17, 227, 23);
		panel.add(textField1);
		textField1.setText("메뉴명");
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(352, 18, 93, 21);
		panel.add(textField2);
		textField2.setText("가격");
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String strMain = (String) textField1.getText();
				String strMainprice = (String) textField2.getText();
				if("메인".equals(comboBox.getSelectedItem())) {
					if("메뉴명".equals(textField1.getText()) || "".equals(textField1.getText())){
						JOptionPane.showMessageDialog(ModifyMenu.this, "메뉴명을 입력하세요",
								"에러메시지", JOptionPane.WARNING_MESSAGE);
					}else {
						MainMenuDAO dao = new MainMenuDAO();
						ArrayList<MainMenuTO> mains = dao.InsertMain(strMain,strMainprice);
						JOptionPane.showMessageDialog(ModifyMenu.this, "메뉴가 추가되었습니다.");
						textField1.setText("");
						textField2.setText("");
						ModifyMenu.this.dispose();
						ModifyMenu main = new ModifyMenu();
						main.setVisible(true);	
					}
				}else{
					if("메뉴명".equals(textField1.getText()) || "".equals(textField1.getText())){
						JOptionPane.showMessageDialog(ModifyMenu.this, "메뉴명을 입력하세요",
								"에러메시지", JOptionPane.WARNING_MESSAGE);
					}else {
						SideMenuDAO dao = new SideMenuDAO();
						ArrayList<SideMenuTO> sides = dao.InsertSide(strMain,strMainprice);
						JOptionPane.showMessageDialog(ModifyMenu.this, "메뉴가 추가되었습니다.");
						textField1.setText("");
						textField2.setText("");
						ModifyMenu.this.dispose();
						ModifyMenu main = new ModifyMenu();
						main.setVisible(true);	
					}
				}
			}
		});
		btnNewButton.setBounds(480, 17, 124, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMain = (String) comboBox2.getSelectedItem();
				String strMainprice = (String) textField3.getText();
				String strSide = (String) comboBox3.getSelectedItem();
				String strSideprice = (String) textField4.getText();

				MainMenuDAO dao = new MainMenuDAO();
				ArrayList<MainMenuTO> mains = dao.updateMain(strMain,strMainprice);
				SideMenuDAO dao2 = new SideMenuDAO();
				ArrayList<SideMenuTO> sides = dao2.updateSide(strSide,strSideprice);
				JOptionPane.showMessageDialog(ModifyMenu.this, "메뉴가 수정되었습니다.");
				
				
				ModifyMenu.this.dispose();
				ModifyMenu main = new ModifyMenu();
				main.setVisible(true);	
			}
		});
		btnNewButton_1.setBounds(493, 142, 123, 23);
		contentPane.add(btnNewButton_1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"메뉴명"}));
		comboBox2.setBounds(12, 142, 257, 23);
		contentPane.add(comboBox2);
		
		textField3 = new JTextField();
		textField3.setText("가격");
		textField3.setColumns(10);
		textField3.setBounds(365, 143, 93, 21);
		contentPane.add(textField3);
		
		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMain = (String) comboBox2.getSelectedItem();
				String strSide = (String) comboBox3.getSelectedItem();
				
				if("메인".equals(comboBox2.getSelectedItem()) && "사이드".equals(comboBox3.getSelectedItem())) {
					JOptionPane.showMessageDialog(ModifyMenu.this, "메인 혹은 사이드를 선택하세요",
							"에러메시지", JOptionPane.WARNING_MESSAGE);
				}else {
					MainMenuDAO dao = new MainMenuDAO();
					ArrayList<MainMenuTO> mains = dao.deleteMain(strMain);
					SideMenuDAO dao1 = new SideMenuDAO();
					ArrayList<SideMenuTO> sides = dao1.deleteSide(strSide);
					JOptionPane.showMessageDialog(ModifyMenu.this, "삭제되었습니다.");
					comboBox2.setSelectedItem("메인");
					comboBox3.setSelectedItem("사이드");
					
					ModifyMenu.this.dispose();
					ModifyMenu main = new ModifyMenu();
					main.setVisible(true);	
				}			
			}
		});
		btnNewButton_2.setBounds(493, 175, 123, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("닫기");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyMenu.this.dispose();
			}
		});
		btnNewButton_3.setBounds(493, 208, 123, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("수정할 가격");
		lblNewLabel_1.setBounds(291, 138, 72, 30);
		contentPane.add(lblNewLabel_1);
		
		textField4 = new JTextField();
		textField4.setText("가격");
		textField4.setBounds(365, 174, 93, 21);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"사이드명"}));
		comboBox3.setBounds(12, 175, 257, 23);
		contentPane.add(comboBox3);
		
		JLabel lblNewLabel_1_2 = new JLabel("메인");
		lblNewLabel_1_2.setBounds(127, 241, 57, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("사이드");
		lblNewLabel_2.setBounds(463, 241, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		//메인 콤보박스 초기화
		MainMenuDAO dao = new MainMenuDAO();
		ArrayList<MainMenuTO> mains = dao.listMain();
		ArrayList<String> strMains = new ArrayList<String>();
		for(MainMenuTO to : mains) {
			strMains.add(to.getMain());
		}
		comboBox2.setModel(new DefaultComboBoxModel(strMains.toArray()));
		
		//사이드 콤보박스 초기화
		SideMenuDAO dao1 = new SideMenuDAO();
		ArrayList<SideMenuTO> sides = dao1.listSide();
		ArrayList<String> strSides = new ArrayList<String>();
		for(SideMenuTO to : sides) {
			strSides.add(to.getSide());
		}
		comboBox3.setModel(new DefaultComboBoxModel(strSides.toArray()));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 267, 306, 331);
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
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(325, 266, 291, 332);
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
		scrollPane_1.setViewportView(table_1);
		
		//메인 테이블에 값넣기
		table.setModel(new MainTable());
		//사이드 테이블에 값넣기
		table_1.setModel(new SideTable());
		
		JLabel lblNewLabel_1_1 = new JLabel("수정할 가격");
		lblNewLabel_1_1.setBounds(291, 171, 72, 30);
		contentPane.add(lblNewLabel_1_1);
		
	}
}
