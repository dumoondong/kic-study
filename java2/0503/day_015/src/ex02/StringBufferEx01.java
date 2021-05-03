package ex02;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100); //저장공간
//		StringBuffer sb3 = new StringBuffer("Hello StringBuffer");
		StringBuilder sb3 = new StringBuilder("Hello StringBuffer");
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity()); 
		
		System.out.println(sb1.length());
		System.out.println(sb3.length());
		
		//String
		//charAt / substring
		//indexOf / lastIndexof
		//replaceAll -> replace
		
		//내부 문자열 조작
		//append / insert / delete
		System.out.println(sb3);
		sb3.append("안녕");
		System.out.println(sb3);
		sb3.insert(3, "추가");
		System.out.println(sb3);
		sb3.delete(0, 4);
		System.out.println(sb3);

	}

}
