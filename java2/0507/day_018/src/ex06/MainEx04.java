package ex06;

public class MainEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//익명 중첩 클래스
		InnerA ia = new InnerA() {
			
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
			}
		};
		ia.viewInner();
		
		//지역변수
		int y = 100;
		
		InnerB ib = new InnerB() {
			
			public void viewInner() {
				System.out.println("viewInner() 호출");
				System.out.println(y);
			}
		};
		ib.viewInner();
	}

}
