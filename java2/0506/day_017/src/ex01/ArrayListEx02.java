package ex01;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array List 데이터 형태를 지정	=	제네릭
		ArrayList<String> al1 = new ArrayList<String>();
		//ArrayList<String> al2 = new ArrayList<>();
		al1.add("홍길동");
		al1.add("박문수");
		al1.add("이몽룡");
		
		for(String str : al1) {
			System.out.println(str);
		}
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("1001","홍길동"));
		al2.add(new Student("1002","박문수"));
		al2.add(new Student("1003","이몽룡"));
		
		for(Student stu : al2) {
			System.out.println(stu.getHakbun());
			System.out.println(stu.getName());
			
		}
		// autoboxing unboxing - wrapper
		ArrayList<Integer> a13 = new ArrayList<Integer>();
		a13.add(Integer.valueOf(3));
		a13.add(4);
		a13.add(5);
		
		int sum = a13.get(0) + a13.get(1);
		System.out.println(sum);
		
		for(int i : a13) {
			System.out.println(i);
		}
	}

}
