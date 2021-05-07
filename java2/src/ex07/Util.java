package ex07;

// Library
public class Util {
	public void methodA(int num) {
		System.out.println("시작");
		
		try {
			if(num == 1) {
				System.out.println(num);
			}else {
				throw new Exception("잘못된 입력입니다");
			}
		}catch(Exception e) {
			System.out.println("에러:" +e.getMessage());
		}
		
		System.out.println("끝");
	}
	//익셉션 처리에 대한 위임
	public void methodB(int num) throws MyException{
		
		System.out.println("시작");
		
		if(num == 1) {
			System.out.println(num);
		}else {
			throw new MyException("잘못된 입력입니다");
		}
		
		System.out.println("끝");
	}
}
