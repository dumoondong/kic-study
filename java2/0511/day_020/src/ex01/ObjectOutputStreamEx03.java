package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./serial2.dat"));
			
			Person p1 = new Person("홍길동", "010-1111-1111", 30, "서울시");
			Person p2 = new Person("박문수", "010-1111-2222", 22, "서울시");
			Person p3 = new Person("이몽룡", "010-1111-3333", 23, "서울시");
			ArrayList<Person> al = new ArrayList<Person>();
			al.add(p1);
			al.add(p2);
			al.add(p3);
			oos.writeObject(al);
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
