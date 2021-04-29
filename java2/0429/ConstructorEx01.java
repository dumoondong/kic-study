class Constructor{
    //Constructor(생성자)
    //멤버 변수에 대한 초기화
    //클래스명과 동일/ 리턴 없음(void, 자료형)
    //생성자에 대한 선언이 없으면 컴파일러 자동생성 - 디폴트 생성자

    String data;

    // Constructor(){
    //     System.out.println("Constructor() 호출");
    //     data = "홍길동";
    // }
    Constructor(String data){
        System.out.println("Constructor() 호출");
        this.data = data;
    }
}
public class ConstructorEx01{
    public static void main(String[] args){
        Constructor c;

        c = new Constructor("박문수");
        System.out.println(c.data);
        
    }
}