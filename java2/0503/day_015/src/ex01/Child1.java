package ex01;

public class Child1 extends Parent {
	public String c1 = "Chil1";
	
	public Child1() {
		// TODO Auto-generated constructor stub
		super("");
		System.out.println("Child1 생성자 호출");
	}
	
	//오버라이드 // annotation
	@Override
	public void viewParent2() {
		// TODO Auto-generated method stub
		super.viewParent2();
		System.out.println("Child1 viewParent2() 호출");
	}
}
