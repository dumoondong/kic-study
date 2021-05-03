package ex02;

public class MathEx02 {
	public static void main(String[] args) {
		
		//0<= Math.random()<1
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		//0<=Math.random() <10 정수만을 추출
		System.out.println((int)(Math.random() * 10));
		System.out.println((int)(Math.random() * 10));
		
		//1 <= Math.random() <45 정수만을 추출
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=6; j++) {
				System.out.print((int)(Math.random() * 45)+1+"\t");
			}
			System.out.println();
		}
		
		
	}
}
