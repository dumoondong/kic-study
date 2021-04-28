class Method{
   //오버 로딩(Overloading :중복정의)
   //같은 이름 메서드를 선언할 수 있다.
   //파라메터 종류 / 갯수 / 순서
   void doFunc(){
       System.out.println("doFunc()");
   }
   void doFunc(int data){
       System.out.println("doFunc(int data)");
   }
   void doFunc(String data){
       System.out.println("doFunc(String data)");
   }
   void doFunc(String data1, int data2){
       System.out.println("doFunc(String data1, int data2)");
   }
   void doFunc(int data1, String data2){
       System.out.println("doFunc(int data1, String data2)");
   }
}
public class MethodEx02{
    public static void main(String[] args){
        Method m = new Method();
        m.doFunc();
        m.doFunc(10);
        m.doFunc("10");
        m.doFunc("10",10);
        m.doFunc(10,"10");
    }
}