package ex02;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Hello String";
		
		//문자열의 길이
		System.out.println(str1.length());
		System.out.println("Hello".length());
		
		//문자 추출(X)
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(str1.length()-1);
		System.out.println(ch1);
		System.out.println(ch2);
		
		//문자열 추출
		String pstr1 = str1.substring(2);
		System.out.println(pstr1);
		// 2<= x <4
		String pstr2 = str1.substring(2,4);
		System.out.println(pstr2);
		
		//문자열 위치
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf("ll"));
		
		System.out.println(str1.indexOf('o',5));
		System.out.println(str1.lastIndexOf('o',5));
		
		//문자열 존재 검색
		//startsWith / contain / endsWith = true/false
		System.out.println(str1.startsWith("h"));
		System.out.println(str1.startsWith("Hel"));
		
		//문자열 치환
		System.out.println(str1.replaceAll("Hello", "안녕"));
		
		//문자열 결합
		System.out.println(str1.concat(" 안녕"));
		
		//대소문자 변경
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//앞뒤공백제거
		String str2 = "     Hello     ";
		System.out.println(str2.length());
		String str21 =  str2.trim();
		System.out.println(str21.length());
		
		// 구분자 단위로 분리
		String str3 = "apple,banana,pineapple,kiwi";
		String[] strArry1 = str3.split(",",2);
		for(String str : strArry1) {
			System.out.println(str);
		}
		//클래스메소드
		String str4 = String.join(",",strArry1);
		System.out.println(str4);
		
		String str5 = strArry1[0]+strArry1[1]+strArry1[2];
		System.out.println(str5);
		
		//format - System.out.printf
		String str6 = String.format("%s,%s,%s",strArry1[0],strArry1[2],strArry1[3]);
	}

}
