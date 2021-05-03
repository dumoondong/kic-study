package ex02;

public class MathEx01 {
	
	public static void main(String[] args) {
		//Math - 수학관련(Static)
		//올림 /내림 /반올림
		System.out.println(Math.ceil(10.3));
		System.out.println(Math.ceil(10.5));
		System.out.println(Math.ceil(10.7));
		
		System.out.println(Math.floor(10.3));
		System.out.println(Math.floor(10.5));
		System.out.println(Math.floor(10.7));
		
		System.out.println(Math.round(10.3));
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.7));
		
		//지수
		System.out.println(Math.pow(10.0, 2.0)); //10^2
		System.out.println(Math.pow(10.0, 2.));  //10^2
		
		
	}
}
