package ex07;

public class ExceptionEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		String name = null;
		int num1 = 0;
		int num2 = 10;
		
		try {
			System.out.println(name.length());
			System.out.println(num2/num1);
			
//		}catch(NullPointerException e) {
//			System.out.println("에러: " +e.getMessage());
//		}catch(ArithmeticException e) {
//			System.out.println("에러: " +e.getMessage() );
//		}
		}catch(Exception e) {
			System.out.println("에러:" + e.getMessage());
		} 
		System.out.println("끝");
	}

}
