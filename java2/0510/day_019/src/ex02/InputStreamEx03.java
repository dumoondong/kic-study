package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputStream is = null;
		//InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("입력 :");
			
			String data = null;
			while((data = br.readLine()) != null ) {
				System.out.println("입력내용 :"+data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
		}
	}

}
