package ex02;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		//경우의수 중복 추출이 줄어듬
		Random r2 = new Random(System.currentTimeMillis());
		
		// 자료형 별로
		System.out.println(r2.nextDouble());
		
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		//0<=x<10
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(45)+1);
	}

}
