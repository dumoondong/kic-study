package ex02;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 저장
		//String/StringBuffer/StringBuilder
		
		String str1 = "Hello String";
		
		//생성자
		String str2 = new String("Hello String");
		char[] charArray = {'H','e','l','l','o'};
		String str3 = new String(charArray);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// ==/equals
		// toString
	}

}
