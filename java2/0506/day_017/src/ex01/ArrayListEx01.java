package ex01;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList();
		//String-> Object
		al1.add("홍길동");
		al1.add("박문수");
		al1.add("이몽룡");
		
		for(Object obj : al1) {
			System.out.println((String)obj);
		}
		
		ArrayList al2 = new ArrayList();
		//데이터 안정성 좋지 않음
		al2.add(new Student("1001", "홍길동"));
		al2.add(new Student("1002", "박문수"));
		al2.add(new Student("1003", "이몽룡"));
		
		for(Object obj : al2) {
			Student stu = (Student)obj;
			System.out.println(stu.getHakbun());
			System.out.println(stu.getName());
			
		}
	}

}
