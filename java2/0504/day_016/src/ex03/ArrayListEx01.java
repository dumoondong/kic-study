package ex03;

import java.util.ArrayList;
import java.util.Date;
public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//저장공간
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList(100);
		
		al1.add("홍길동");
		al1.add(new String("박문수"));
		al1.add(new Date());
		
		System.out.println(al1.size());
		System.out.println(al1.toString());
		
		Object obj1 = al1.get(0);
		String str1 = (String)obj1;
		System.out.println(str1);
		
		Object obj2 = al1.get(2);
		Date date1 = (Date)obj1;
		System.out.println(date1.toLocaleString());
	}

}
