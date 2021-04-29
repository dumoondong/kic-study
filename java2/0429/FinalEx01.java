class Parent1 {
    final void doFunc1() {
        System.out.println( "doFunc1() 호출" );
    }
}

final class Parent2 {
}

class Child1 extends Parent1 {
    void doFunc1() {
        System.out.println( "Child1 doFunc1() 호출" );
    }
}

//class Child2 extends Parent2 {
//}

public class FinalEx01 {
    public static void main(String[] args) {
        // final 변수 - 상수
        // final 클래명 - 상속 불가 클래스
        // final 메서드 - 오버라이딩 불가

        Child1 c1 = new Child1();
        //Child2 c2 = new Child2();
    }
}