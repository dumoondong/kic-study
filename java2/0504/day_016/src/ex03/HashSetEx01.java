package ex03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		//중복배제
		hs.add("아메리카노");
		hs.add("에스프레소");
		hs.add("카푸치노");
		hs.add("아메리카노");
		hs.add("에스프레소");
		hs.add("카푸치노");
		
		System.out.println(hs.size());
		System.out.println(hs.toString());
		//index
//		hs.remove("아메리카노");
//		System.out.println(hs.toString());
//		hs.clear();
//		System.out.println(hs.toString());
		
		//구형
		//반복자 - 인덱스 대신 사용
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println((String)i.next());
		}
		
		for(Object o : hs) {
			System.out.println((String)o);
		}
	}

}
