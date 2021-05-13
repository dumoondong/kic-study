package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx08 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbx1;
	private JCheckBox chckbx2;
	private JCheckBox chckbx3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx08 frame = new JFrameEx08();
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
	public JFrameEx08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbx1 = new JCheckBox("사과");
		chckbx1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				if(chckbx1.isSelected()) {
					textArea.setText("선택됨");
				}else {
					textArea.setText("선택안됨");
				}
			}
		});
		chckbx1.setBounds(8, 6, 115, 23);
		contentPane.add(chckbx1);
		
		chckbx2 = new JCheckBox("참외");
		chckbx2.setBounds(8, 31, 115, 23);
		contentPane.add(chckbx2);
		
		chckbx3 = new JCheckBox("수박");
		chckbx3.setSelected(true);
		chckbx3.setBounds(8, 56, 115, 23);
		contentPane.add(chckbx3);
		
		JButton btn = new JButton("결과");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(" ");
//				textArea.append("체크 박스1 : "+ chckbx1.isSelected()+"\n");
//				textArea.append("체크 박스2 : "+ chckbx2.isSelected()+"\n");
//				textArea.append("체크 박스3 : "+ chckbx3.isSelected()+"\n");
				//선택된 값을 알고 싶을 때 : getText()
				//setText()
				String result = "";
				if(chckbx1.isSelected()) {
					result += chckbx1.getText() + "\n";
				}
				if(chckbx2.isSelected()) {
					result += chckbx2.getText() + "\n";
				}
				if(chckbx3.isSelected()) {
					result += chckbx3.getText() + "\n";
				}
				textArea.setText(result);
			}
		});
		btn.setBounds(8, 85, 534, 23);
		contentPane.add(btn);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(8, 118, 534, 168);
		contentPane.add(textArea);
	}
}
