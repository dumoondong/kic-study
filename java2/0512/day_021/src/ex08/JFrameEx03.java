package ex08;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class JFrameEx03 extends JFrame {
	// Pane = Panel (다른 위젯을 올리는 영역 : 집합영역)
	private JPanel contentPane;
	
	public JFrameEx03() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setBackground(Color.GREEN);
		//layout(좌표계 : null(absolute) layout)
		contentPane.setLayout(null);
		//widget
		JButton btn = new JButton("난 버튼");
		btn.setBounds(10,10,100,25);
		contentPane.add(btn);
		
		setContentPane(contentPane);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스레드 형식으로 처리
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					JFrameEx03 frame = new JFrameEx03();
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}

}
