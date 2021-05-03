package ex02;

public class ObjectEx01 /*extends Object */{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		
		//객체변수 = o1.toString()
		//클래스형태@참조주소
		System.out.println(o1);
		System.out.println(o1.toString());
		
		ObjectEx01 o2 = new ObjectEx01();
		System.out.println(o2);
		System.out.println(o2.toString());
		
		//클래스에 대한 정보
		System.out.println(o1.getClass().getName());
		System.out.println(o1.hashCode());
		System.out.printf("%x\n", o1.hashCode());
		//오버라이딩
		String str = new String("Hello");
		System.out.println(str);
		System.out.println(str.toString());
		
		Student s = new Student("홍길동", 30);
		System.out.println(s);
		//toString 클래스 내부의 멤버필드의 내용을 출력할 목적으로
		//미리 Object 클래스에 선언
		System.out.println(s.toString());
	}

}
