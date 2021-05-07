package ex06;

public class MainEx01 {
	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		//System.out.println(out.x1);
		System.out.println(out.x2);
		
		Outer1.Inner oi = out.new Inner();
		//System.out.println(oi.y1);
		System.out.println(oi.y2);
		
		oi.viewInner();
	}
}
