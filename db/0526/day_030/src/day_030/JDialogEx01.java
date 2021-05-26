package day_030;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogEx01 frame = new JDialogEx01();
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
	public JDialogEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(450, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialogSub dialog = new JDialogSub("생성자를 통한 데이터");
				//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setModal(true);		//부모 - 자식
				
				Rectangle rectangle = JDialogEx01.this.getBounds();
				// 부모창의 위치와 사이즈
				//Rectangle rectangle = dialog.getBounds();
				// 자식창의 위치와 사이즈
				System.out.println(rectangle.getX());
				System.out.println(rectangle.getY());
				System.out.println(rectangle.getWidth());
				System.out.println(rectangle.getHeight());
				
				int px = (int)rectangle.getX();
				int py = (int)rectangle.getY();
				int pwidth = (int)rectangle.getWidth();
				int pheight = (int)rectangle.getHeight();
				
				int cwidth = 800;
				int cheight = 600;
				
				dialog.setBounds(pwidth/2-cwidth/2+px, pheight/2-cheight/2+py, cwidth, cheight);
				//
				
				//dialog.setData("부모가 보낸 데이터");
				
				dialog.setVisible(true);
				
				System.out.println(dialog.getData());
			}
		});
		btnNewButton.setBounds(12, 10, 97, 23);
		contentPane.add(btnNewButton);
	}
}
