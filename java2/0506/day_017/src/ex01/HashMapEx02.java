package ex01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm1 = new HashMap<String,String>();
		hm1.put("a", "홍길동");
		hm1.put("b", "박문수");
		hm1.put("c", "이몽룡");
		
		//key모음
		Set<String> keys = hm1.keySet();
		for(String key : keys) {
			System.out.println(key+":" + hm1.get(key));
		}
		
		//value 모음
		Collection<String> values = hm1.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		HashMap<String, Student> hm2 = new HashMap<String, Student>();
		hm2.put("a1", new Student("1001","홍길동"));
		hm2.put("a2", new Student("1002","박문수"));
		hm2.put("a3", new Student("1003","이몽룡"));
		
		//key
		Set<String> keys2 = hm2.keySet();
		for(String key : keys2) {
			Student stu = hm2.get(key);
			System.out.println(key+":" + stu.getHakbun()+":"+stu.getName());
		}
		//value
		Collection<Student> values2 = hm2.values();
		for(Student value : values2) {
			System.out.println(value.getHakbun());
			System.out.println(value.getName());
		}
		
	}

}
