package ex01;

import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("홍길동");
		l1.add("박문수");
		l1.add("이몽룡");
		
		for(String str : l1) {
			System.out.println(str);
		}
	}

}
