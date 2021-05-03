package ex01;

public class inhertanceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent("");
		System.out.println(p.p);
		
		p.viewParent1();
		p.viewParent1();
		
		Child1 c1 = new Child1();
		System.out.println(c1.c1);
		
		c1.viewParent1();
		c1.viewParent2();
		
		Child2 c2 = new Child2();
		System.out.println(c2.c1);
		
		c2.viewParent1();
		c2.viewParent2();
	}

}
