package ex07;

public class ExcepitionEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		try {
			int num1 = 0;
			int num2 = 10;
			System.out.println("1");
			int result = num2 / num1;
			System.out.println("2");
			System.out.println("결과: " +result);
		}catch(ArithmeticException e) {
			System.out.println("3" + e.getMessage());
		}finally {
			//정리 작업
			System.out.println("4");
		}
		
		System.out.println("끝");
	}

}
