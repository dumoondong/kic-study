//클래스 선언 (새로운 자료형의 선언)
class Student{
	String name;
	String hakbun;
	double height;
	double weight;
}

public class StudentEx{
    public static void main(String[] args){
        //저웃형 변수 i를 선언하고 10이란 값으로 초기화
        int i;
        i=10;

        //객체 변수 //참조변수/인스턴스 선언
        //인스터스화
        Student s1;
        //메모리 생성
        //new 메모리 생성(할당) 연산자
        s1=new Student();

        //객체 변수 초기화
        //.객체 참조 연산자
        s1.name="홍길동";
        s1.hakbun="1001";
        s1.height=180.5;
        s1.weight=75;

        System.out.println(s1.name);
        System.out.println(s1.hakbun);
        
        Student s2 = new Student();
        s2.name="박문수";
        s2.hakbun="1002";
        s2.height=176;
        s2.weight=65;

        System.out.println(s2.name);
        System.out.println(s2.hakbun);

        System.out.println(s1);
        System.out.println(s2);
    }
}