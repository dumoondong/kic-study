package ex03;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		
		//상속
		c1.methodA();
		c1.methodB();		//overriding
		c1.methodC();
		
		//형변환
		Parent p1 = new Child1();
		p1.methodA();
		p1.methodB();		//overriding
		//p1.methodC();
		
		p1 = new Child2();
		p1.methodA();
		p1.methodB();		//overriding
	}

}
