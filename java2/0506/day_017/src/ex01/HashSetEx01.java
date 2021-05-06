package ex01;

import java.util.HashSet;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("아메리카노");
		hs.add("에스프레소");
		hs.add("카푸치노");
		hs.add("아메리카노");
		hs.add("에스프레소");
		hs.add("카푸치노");
		hs.add("아메리카노");
		hs.add("에스프레소");
		hs.add("카푸치노");
		System.out.println(hs.size());
		System.out.println(hs.toString());
		
		for(String str : hs) {
			System.out.println(str);
		}
	}

}
