package ex07;

public class ExceptionEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Util u = new Util();
		//u.methodA(1);
		u.methodA(0);
		
		try {
			u.methodB(1);
		}catch(MyException e) {
			e.printStackTrace();
		}
	}
}
