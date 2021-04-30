import com.naver.Student;
public class StudentEx{
    public static void main(String[] args){
        //패키지 내부에 클래스에 접근하는 방법
        Student s = new Student("1001", "홍길동",35,180);

        // s.hakbun = "1001";
        // s.name = "홍길동";
        // s.age = 35;
        // s.height = 180;

        // System.out.println(s.hakbun);

        // s.setHakbun("1001");
        // s.setName("홍길동");
        // s.setAge(35);
        // s.setHeight(100);
        // System.out.println(s.getHakbun());
    }
}