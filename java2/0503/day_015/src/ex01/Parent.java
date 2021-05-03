package ex01;

public class Parent {
	String p = "Parent";
	
//	public Parent() {
//		System.out.println("Parent 생성자 호출");
//	}
	
	public Parent(String data1) {
		System.out.println("Parent 생성자 호출");
	}
	
	public void viewParent1() {
		System.out.println("viewParent1() 호출");
	}
	public void viewParent2() {
		System.out.println("viewParent2() 호출");
	}
}
