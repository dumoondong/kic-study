package test;

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
import javax.swing.JScrollPane;

public class SearchSubway extends JFrame {
	private JTextArea textArea;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JPanel contentPane;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchSubway frame = new SearchSubway();
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
	public SearchSubway() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"지역"}));
		comboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println("comboBox1 변경");
					if(comboBox1.getSelectedIndex() != 0) {
						String strLocal = (String)comboBox1.getSelectedItem();
						
						SubwayDAO dao = new SubwayDAO();
						ArrayList<SubwayTO> lines = dao.listLine(strLocal);
						
						ArrayList<String> strLines = new ArrayList<String>();
						for(SubwayTO to : lines) {
							strLines.add(to.getLine());
						}
						
						comboBox2.setModel(new DefaultComboBoxModel(strLines.toArray()));
					}
				}
			}
		});
		comboBox1.setBounds(0, 0, 180, 23);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"노선"}));
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println("comboBox3 변경");
					if(comboBox2.getSelectedIndex() != 0) {
						String strLocal = (String)comboBox1.getSelectedItem();
						String strLine = (String)comboBox2.getSelectedItem();
						
						textArea.setText("");
						
						SubwayDAO dao = new SubwayDAO();
						ArrayList<SubwayTO> subways = dao.listSubways(strLocal, strLine);
						for(SubwayTO to : subways) {
							String subway = String.format("%s \t %s  \t %s\n",
									to.getLocal(), to.getLine(), to.getStation() );
							textArea.append(subway);
						}
					}
				}
			}
		});
		comboBox2.setBounds(179, 0, 180, 23);
		contentPane.add(comboBox2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 23, 359, 405);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		SubwayDAO dao = new SubwayDAO();
		ArrayList<SubwayTO> locals = dao.listLocal();
		ArrayList<String> strLocals = new ArrayList<String>();
		for(SubwayTO to : locals) {
			strLocals.add(to.getLocal());
		}
		comboBox1.setModel(new DefaultComboBoxModel(strLocals.toArray()));
	}
}
