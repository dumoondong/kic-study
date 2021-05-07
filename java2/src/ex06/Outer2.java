package ex06;

public class Outer2 {
	private int x1 = 100;
	public int x2 = 100;
	//클래스(스태틱) 중첩 클래스
	static class Inner{
		private int y1 = 200;
		public int y2 = 200;
		
		public Inner() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner : " + this);
		}
		
		public void viewInner() {
			System.out.println(y1);
			System.out.println(y2);
		}
	}
}
