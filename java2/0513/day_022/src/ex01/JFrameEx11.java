package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrameEx11 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx11 frame = new JFrameEx11();
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
	public JFrameEx11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("주민등록번호 검사기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl.setText("");
				String result = JOptionPane.showInputDialog("메시지 내용",JOptionPane.YES_NO_OPTION);
				if(result.length() == 14) {
						int last = Integer.valueOf(result.substring(13,14));
						int n1 = Integer.valueOf(result.substring(0,1))* 2; 
				        int n2 = Integer.valueOf(result.substring(1,2))* 3; 
				        int n3 = Integer.valueOf(result.substring(2,3))* 4; 
				        int n4 = Integer.valueOf(result.substring(3,4))* 5; 
				        int n5 = Integer.valueOf(result.substring(4,5))* 6; 
				        int n6 = Integer.valueOf(result.substring(5,6))* 7; 
				        int n7 = Integer.valueOf(result.substring(7,8))* 8; 
				        int n8 = Integer.valueOf(result.substring(8,9))* 9; 
				        int n9 = Integer.valueOf(result.substring(9,10))* 2; 
				        int n10 = Integer.valueOf(result.substring(10,11))* 3; 
				        int n11 = Integer.valueOf(result.substring(11,12))* 4; 
				        int n12 = Integer.valueOf(result.substring(12,13))* 5;
				        int n = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12;
				        
				        int n13 = (11-(n%11))%10;
				                if(last == n13){
				                    lbl.setText("맞다");
				                }else{
				                	lbl.setText("틀리다");
				                }
				}else {
					lbl.setText("다시 입력하세요");
				}
			}
		});
		btn1.setBounds(12, 10, 243, 23);
		contentPane.add(btn1);
		
		lbl = new JLabel("결과");
		lbl.setBounds(12, 43, 412, 34);
		contentPane.add(lbl);
	}

}
