class Method{
    //메서드 (ecmascript : function ....)

    //선언
    void doFunc1(){
        System.out.println("doFunc1() 호출");
    }
    void doFunc2(int data1){
        //int data1 - 지역변수
        System.out.println("doFunc2()호출:"+data1);
    }
    void doFunc3(int data1, int data2){
        System.out.println("doFunc2()호출:"+data1);
        System.out.println("doFunc2()호출:"+data2);
    }
    //void : 리턴없는 것을 나타내는 예약어(키워드)
    int doFunc4(int data1, int data2){
        int sume = data1 + data2;
        return sum;
    }
}
public class MethodEx{
    public static void main(String[] args){
        Method m = new Method();

        //호출
        m.doFunc1();
        m.doFunc2(10);
        m.doFunc3(10,30);
    }
}