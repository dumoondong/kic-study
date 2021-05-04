package ex02;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명령 프롬포트에서 입력
		//파일 입력
		//System.in - 키보드(표준입력장치)를 통한 입력
		Scanner  sc = new Scanner (System.in);
		System.out.print("입력>");
		//한 단어씩 입력
		String msg1 = sc.next();		//입력 끌어 엔터키
		String msg2 = sc.next();
		
		System.out.println("입력 메시지 :" +msg1);
		System.out.println("입력 메시지 :" +msg2);
		sc.close();
	}

}
