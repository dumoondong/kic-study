class Parent{
    String p = "parent";
    Parent() {
        System.out.println("Parent() : "+this);
    }
    void doFunc1(){
        System.out.println("doFunc1()");
    }

}
class Child extends Parent{
    String c= "child";
    Child() {
        System.out.println("Child() : "+this);
    }
    // overloading : 재정의

    //이름, 파라메터, 리턴 같아야 한다.
    void doFunc1(){
        System.out.println("child doFunc1()");

        // super = parent
        super.doFunc1();
        System.out.println(super.p);
    }
    void doFunc2(){
        System.out.println("doFunc2()");
    }

}
public class InheritanceEx04{
    public static void main(String[] args){
        Child c = new Child();
        c.doFunc2();

        c.doFunc1();
    }
}