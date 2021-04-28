public class MethodEx07{
    //멤버필드(변수)
    String instanceVariable = "instance";
    static String staticVariable = "static";

    void doFunc01(){
        System.out.println("doFunc01()");
    }
    static void doFunc02(){
        System.out.println("doFunc02()");
    }

    public static void main(String[] args){
        MethodEx07 m = new MethodEx07();
        System.out.println(m.instanceVariable);
        System.out.println(MethodEx07.staticVariable);

        m.doFunc01();
        MethodEx07.doFunc02();
    }
}