package ex06;

public class MainEx03 {
	public void doInner() {
		int x = 100;
		//지역 중첩 클래스
		class Inner{
			private int y1 = 200;
			public int y2 = 200;
			
			public Inner() {
				// TODO Auto-generated constructor stub
				System.out.println("Inner:" + this);
			}
			public void viewInner() {
				System.out.println("viewInner() 호출");
				
				System.out.println(y1);
				System.out.println(y2);
				
				System.out.println(x);
			}
		}
		Inner i = new Inner();
	}
	//메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainEx03 me = new MainEx03();
		me.doInner();
	}

}
