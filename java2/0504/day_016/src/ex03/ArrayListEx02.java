package ex03;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		
		al1.add("홍길동");
		al1.add("박문수");
		al1.add("이몽룡");
		
		for(int i =0; i<al1.size(); i++) {
			String data = (String)al1.get(i);
			System.out.println(data);
		}
		for(Object obj : al1) {
			System.out.println((String)obj);
		}
		
		//추가 데이터
		al1.add(2,"임꺽정");
		System.out.println(al1);
		
		//수정
		al1.set(0, "방자");
		System.out.println(al1);
		
		//삭제
		al1.remove(0);
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
		System.out.println(al1.size());
	}

}
