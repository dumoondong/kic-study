package ex02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputStream is = null;
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(System.in);
			System.out.print("입력 :");
			
			int data = 0;
			while((data = isr.read()) != 13 ) {
				System.out.println("입력내용 :"+(char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(isr != null)try {isr.close();}catch(IOException e) {}
		}
	}

}
