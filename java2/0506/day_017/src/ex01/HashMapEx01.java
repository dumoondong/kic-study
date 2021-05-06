package ex01;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map - 사전구조(키,값)
		//put
		
		HashMap<String, String> hm1 = new HashMap<String,String>();
		hm1.put("a", "홍길동");
		hm1.put("b", "박문수");
		hm1.put("c", "이몽룡");
		
		System.out.println(hm1.size());
		System.out.println(hm1.toString());
		
		hm1.put("d", "임꺽정");
		System.out.println(hm1.toString());
		
		hm1.put("c", "방자");
		System.out.println(hm1.toString());
		
		System.out.println(hm1.get("a"));
		
		hm1.remove("a");
		System.out.println(hm1.toString());
		
		hm1.clear();
		System.out.println(hm1.toString());
		
		HashMap<String, Student> hm2 = new HashMap<String, Student>();
		hm2.put("a1", new Student("1001","홍길동"));
		hm2.put("a2", new Student("1002","박문수"));
		hm2.put("a3", new Student("1003","이몽룡"));
		
		Student stu = hm2.get("a1");
		System.out.println(stu.getHakbun());
		System.out.println(stu.getName());
	}

}
