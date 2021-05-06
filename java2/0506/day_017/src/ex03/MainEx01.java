package ex03;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1 = new Parent1();
		Child1 c1 = new Child1();
		c1.viewParent1();
		
		//추상클래스 직접 인스턴스화가(객체변수)가 안됨	-불완전 클래스
		//Parent2 p2 = new Parent2();
		//상속을 통한 자식을 통해서 완성된 클래스
//		Child2 c2 = new Child2();
//		c2.viewParent1();
//		c2.viewParent2();
		
		GrandChild2 gc2 = new GrandChild2();
		gc2.viewParent2();
		
	}

}
