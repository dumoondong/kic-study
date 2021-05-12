package ex08;

import javax.swing.JFrame;

public class JFrameEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//has - a
		//is -a
		
//		JFrame frame = new JFrame("난 제목 1");
		JFrame frame = new JFrame();
		frame.setTitle("난 제목 2");
		System.out.println(frame.getTitle());
		
//		frame.setSize(1024, 768);
//		frame.setLocation(100, 100);
		frame.setBounds(100, 100, 1024, 768);
		frame.setVisible(true);
	}

}
