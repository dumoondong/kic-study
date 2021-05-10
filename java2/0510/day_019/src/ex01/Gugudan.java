package ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Gugudan {

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
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("./gugudan.txt");
			for(int i=start; i<=end; i++) {
				for(int j=1; j<=9; j++) {
					fw.write(i+"X"+j +"="+i*j+"\t");
				}
					fw.write("\r\n");
			}
			System.out.println("출력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}finally {
			if(fw != null)try {fw.close();}catch(IOException e) {}
		}
	}

}
