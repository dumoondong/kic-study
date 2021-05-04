package ex01;

public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		if(args.length != 1) {
			System.out.println("비정상");
		}else {
			System.out.println("정상");
		}
		System.out.println("끝");
	}

}
