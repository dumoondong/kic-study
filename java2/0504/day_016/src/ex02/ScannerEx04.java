package ex02;

import java.util.Scanner;

public class ScannerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner (System.in);
		while(true) {
			System.out.print("입력>");
			
			int data = sc.nextInt();
			if(data == 0) {
				break;
			}else {
				System.out.println("데이터:" + data);
			}
		}
		sc.close();
	}

}
