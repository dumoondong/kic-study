class Method{
    String instanceVariable = "instance";
    static String staticVariable = "static";

    void doFunc1(){
        System.out.println("doFunc1()");

        System.out.println(this.instanceVariable);
        System.out.println(this.staticVariable);
    }
    static void doFunc2(){
        System.out.println("doFunc2()");

        
    }
}

public class MethodEx06{
    public static void main(String[] args){
        Method.doFunc2();
        Method m = new Method();
        m.doFunc1();
    }
}