package ex06;

public class Outer1 {
	private int x1 = 100;
	public int x2 = 100;
	
	public Outer1() {
		// TODO Auto-generated constructor stub
		System.out.println("Outer1:" + this);
	}
	
	//인스턴스 중첩(내부) 클래스
	class Inner{
		private int y1 = 200;
		public int y2 = 200;
		
		public Inner() {
			System.out.println("Innter :" + this);
			System.out.println("Outer1 :" + Outer1.this);
		}
		public void viewInner() {
			System.out.println("viewInner() 호출");
			
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(y1);
			System.out.println(y2);
		}
	}
}
