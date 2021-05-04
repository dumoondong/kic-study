package ex02;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명령 프롬포트에서 입력
		
		Scanner  sc = new Scanner (System.in);
		System.out.print("입력>");
			
		//한줄 입력
		String msg = sc.nextLine();	//입력 끌어 엔터키
		
		System.out.println("입력 메시지 :" + msg);
		
		sc.close();
			
	}

}
