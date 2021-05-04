package ex03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner (System.in);
		System.out.print("시작단 입력>");
		int start = sc.nextInt();	
		System.out.print("끝단 입력>");
		int end = sc.nextInt();
		
		if(end<start) {
			System.out.print("다시 시작단 입력>");
			start = sc.nextInt();		
			System.out.print("끝단 입력>");
			end = sc.nextInt();
		}
		for(int i=1; i<=end; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"X"+j + "=" + i*j+ "\t");
			}
			System.out.println();
		}
	}
}
