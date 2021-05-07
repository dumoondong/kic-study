package ex04;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		
		//Parent p = new Parent();
		
		Parent p1 = new Child1();
		p1.methodB();
		
		Parent p2= new Child2();
		p2.methodB();
		System.out.println(p1 instanceof Object);
		System.out.println(p1 instanceof Child1);
		System.out.println(p1 instanceof Parent);
		System.out.println(p1 instanceof Child2);
	}

}
