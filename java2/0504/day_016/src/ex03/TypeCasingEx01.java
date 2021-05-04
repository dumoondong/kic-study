package ex03;

public class TypeCasingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		
		c1.doFunc1();	//부모
		c1.doFunc2();	//자식
		c1.doFunc3();
		//형변환
		//자동 형변환
		Parent p1 = c1;
		p1.doFunc1();
		p1.doFunc2();		//자식
		//p1.doFunc3();		//호출 못함
		
		//강제형변환
		Child1 c2 = (Child1)p1;
		c2.doFunc1();
		c2.doFunc2();
		c2.doFunc3();
		//compile 에러가 아니고 runtime 에러가 발생
		Child1 c3 = (Child1)new Parent();
		c2.doFunc1();
		c2.doFunc2();
		c2.doFunc3();
	}

}
