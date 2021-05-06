package ex02;

import java.text.MessageFormat;

public class MessageFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "이름:{0},Java:{1}, HTML:{2},Script:{3}";
		String source = "홍길동:100:90:85,박문수:90:95:70";
		String[] students = source.split(",");
		
		for(String student : students) {
			System.out.println(student);
			
			String msg = MessageFormat.format(pattern,student.split(":"));
			System.out.println(msg);
		}
	}

}
