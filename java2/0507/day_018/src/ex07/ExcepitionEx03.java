package ex07;

public class ExcepitionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		String[] datas = {"1","2","3"};
		try {
		System.out.println(datas[0]);
		System.out.println(datas[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 :" + e.getMessage());
		}
		System.out.println("끝");
	}

}
