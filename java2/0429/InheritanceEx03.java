class Parent{
    String p = "parent";
    Parent() {
        System.out.println("Parent() : "+this);
    }

}
class Child extends Parent{
    String c= "child";
    Child() {
        System.out.println("Child() : "+this);
    }
}
class GrandChild extends Child{
    String gc= "child2";
    GrandChild() {
        System.out.println("GrandChild() : "+this);
    }
}
public class InheritanceEx03{
    public static void main(String[] args){
        GrandChild gc = new GrandChild();
    }
}