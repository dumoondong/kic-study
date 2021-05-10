package ex02;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		
		try {
			is = System.in;
			System.out.print("입력 :");
			
			int data = 0;
			while((data = is.read()) != 13 ) {
				System.out.println("입력내용 :"+(char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(is != null)try {is.close();}catch(IOException e) {}
		}
	}

}
