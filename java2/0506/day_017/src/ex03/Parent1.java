package ex03;

public class Parent1 {
	public Parent1() {
		System.out.println("Parent1() 호출");
	}
	
	public void viewParent1() {
		System.out.println("viewParent1() 호출");
	}
	//일반 클래스에서는 추상 메서드를 선언할 수 없음
	//public abstract void viewParent2();
}
