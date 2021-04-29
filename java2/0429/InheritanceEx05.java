class Parent{
    // Parent() {
    //     System.out.println("Parent() : "+this);
    // }
    Parent(int data) {
        System.out.println("Parent() : "+this);
    }


}
class Child extends Parent{
    String c= "child";
    Child() {
        super(10);
        System.out.println("Child() : "+this);
    }
}
public class InheritanceEx05{
    public static void main(String[] args){
        Child c = new Child();
    }
}