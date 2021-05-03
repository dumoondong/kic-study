package ex01;

public class Child2 extends Parent {
	public String c1 = "Chil2";
	
	public Child2() {
		// TODO Auto-generated constructor stub
		super("");
		System.out.println("Child2 생성자 호출");
	}

	@Override
	public void viewParent2() {
		// TODO Auto-generated method stub
		super.viewParent2();
		System.out.println("Child2 viewParent2() 호출");
	}
}
