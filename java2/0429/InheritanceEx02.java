class Parent{
    String p = "parent";

}
class Child extends Parent{
    String c= "child";
}
class GrandChild extends Child{
    String gc= "child2";
}
public class InheritanceEx02{
    public static void main(String[] args){
        GrandChild gc = new GrandChild();
        System.out.println(gc.gc);
        System.out.println(gc.c);
        System.out.println(gc.p);
       
    }
}