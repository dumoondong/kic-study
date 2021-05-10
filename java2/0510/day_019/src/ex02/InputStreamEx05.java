package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("시작단 입력");
			int start = Integer.parseInt(br.readLine());
			System.out.println("끝단 입력");
			int end = Integer.parseInt(br.readLine());
			
			for(int i=start; i<=end; i++) {
				for(int j=1; j<=9; j++) {
					System.out.print(i+"X"+j +"="+i*j+"\t");
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
		}
	}

}
