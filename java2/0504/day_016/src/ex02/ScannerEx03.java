package ex02;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner (System.in);
		System.out.print("점수 입력>");
			
		int intPoint = sc.nextInt();	//입력 끌어 엔터키
		
		if(intPoint >=90) {
			System.out.println("A학점");
		}else if(intPoint >=80) {
			System.out.println("B학점");
		}else if(intPoint >=70){
			System.out.println("C학점");
		}else if(intPoint >=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점학점");
		}
		sc.close();
	}

}
