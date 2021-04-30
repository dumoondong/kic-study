import com.naver.Student;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		//com.naver.Student s = new com.naver.Student();
		
		Student s = new Student();
		
		s.setHakbun("1001");
		s.setName("홍길동");
		s.setAge(35);
		s.setHeight(180);
		
		System.out.println(s.getHakbun());
	}

}
