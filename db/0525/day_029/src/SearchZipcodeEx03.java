

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class SearchZipcodeEx03 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchZipcodeEx03 frame = new SearchZipcodeEx03();
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
	public SearchZipcodeEx03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 7, 609, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"시도1","시도2"}));
		comboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println("comboBox1 변경");
					if(comboBox1.getSelectedIndex() != 0) {
						String strSido = (String)comboBox1.getSelectedItem();
						
						ZipcodeDAO dao = new ZipcodeDAO();
						ArrayList<ZipcodeTO> guguns = dao.listGugun(strSido);
						
						ArrayList<String> strGuguns = new ArrayList<String>();
						for(ZipcodeTO to : guguns) {
							strGuguns.add(to.getGugun());
						}
						
						comboBox2.setModel(new DefaultComboBoxModel(strGuguns.toArray()));
					}
				}
			}
		});
		comboBox1.setBounds(6, 17, 162, 23);
		panel.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"구군1","구군2"}));
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(comboBox2.getSelectedIndex() != 0) {
						String strSido = (String)comboBox1.getSelectedItem();
						String strGugun = (String)comboBox2.getSelectedItem();
						
						ZipcodeDAO dao = new ZipcodeDAO();
						ArrayList<ZipcodeTO> dongs = dao.listDong(strSido,strGugun);
						
						ArrayList<String> strDongs = new ArrayList<String>();
						for(ZipcodeTO to : dongs) {
							strDongs.add(to.getDong());
						}
						comboBox3.setModel(new DefaultComboBoxModel(strDongs.toArray()));
					}
				}
			}
		});
		comboBox2.setBounds(180, 17, 194, 23);
		panel.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"동1","동2"}));
		comboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println("comboBox3 변경");
					if(comboBox3.getSelectedIndex() != 0) {
						String strSido = (String)comboBox1.getSelectedItem();
						String strGugun = (String)comboBox2.getSelectedItem();
						String strDong = (String)comboBox3.getSelectedItem();
						
						textArea.setText("");
						
						ZipcodeDAO dao = new ZipcodeDAO();
						ArrayList<ZipcodeTO> addresses = dao.listAddress(strSido, strGugun, strDong);
						for(ZipcodeTO to : addresses) {
							String address = String.format("[%s] %s %s %s %s %s\n",
									to.getZipcode(), to.getSido(), to.getGugun(),
									to.getDong(), to.getRi(), to.getBunji() );
							textArea.append(address);
						}
					}
				}
			}
		});
		comboBox3.setBounds(409, 17, 194, 23);
		panel.add(comboBox3);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(12, 75, 597, 334);
		contentPane.add(textArea);
		
		//comboBox1 초기화
		ZipcodeDAO dao = new ZipcodeDAO();
		ArrayList<ZipcodeTO> sidos = dao.listSido();
		ArrayList<String> strSidos = new ArrayList<String>();
		for(ZipcodeTO to : sidos) {
			strSidos.add(to.getSido());
		}
		comboBox1.setModel(new DefaultComboBoxModel(strSidos.toArray()));
	}
	
	
	public StringBuffer listAddress(String strSido,String strGugun,String strDong){
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer addresses = new StringBuffer();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select zipcode,sido,gugun,dong,ri,bunji from zipcode where sido=? and gugun=? and dong=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			pstmt.setString(3, strDong);
			
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String address = String.format("[%s] %s %s %s %s %s\n",
						rs.getString("zipcode"), rs.getString("sido"), rs.getString("gugun"),
						rs.getString("dong"), rs.getString("ri"), rs.getString("bunji") );
					addresses.append(address);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return addresses;
	}
}
