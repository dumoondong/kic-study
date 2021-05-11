package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./serial.dat"));
			
			Person p = new Person("홍길동", "010-1111-1111", 30, "서울시");
			oos.writeObject(p);
			System.out.println("출력 성공");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println("에러 :" + e.getMessage());
			e.printStackTrace();
		}finally {
			if(oos != null)try {oos.close();}catch(IOException e) {}
		}
	}

}
