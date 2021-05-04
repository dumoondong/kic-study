package ex03;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		Student stu1 = new Student("1001", "홍길동");
		Student stu2 = new Student("1002", "박문수");
		Student stu3 = new Student("1003", "이몽룡");
		
		al.add(stu1);
		al.add(stu2);
		al.add(stu3);
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			Student stu = (Student)al.get(0);
			System.out.println(stu.getHakbun()+"/"+stu.getName());
		}
		//향상된for 
		for(Object o :al) {
			Student stu = (Student)o;
			System.out.println(stu.getHakbun()+"/"+stu.getName());
		}
	}

}
