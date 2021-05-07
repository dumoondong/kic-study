package ex06;

public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 ot = new Outer2();
		System.out.println(ot.x2);
		
		Outer2.Inner oi = new Outer2.Inner();
		System.out.println(oi.y2);
		
		oi.viewInner();
	}

}
