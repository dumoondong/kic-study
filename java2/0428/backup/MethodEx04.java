class Method{
   // 인스턴스 메서드 / 클래스 메서드
   void doFunc1(){
       System.out.println("doFunc1() 호출");
   }
   static void doFunc2(){
       System.out.println("doFunc2() 호출");
   }
}
public class MethodEx04{
    public static void main(String[] args){
        Method m = new Method();
        m.doFunc1();
        m.doFunc2();

        Method.doFunc2();       //(0)
    }
}