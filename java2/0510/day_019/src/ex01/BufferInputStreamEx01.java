package ex01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
//			fis = new FileInputStream("./gugudan.txt");
//			bis = new BufferedInputStream(fis);
			bis = new BufferedInputStream(new FileInputStream("./gugudan.txt"));
			
			int data = 0;
			while((data = bis.read())!= -1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage()); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}finally {
			if(bis != null)try {bis.close();}catch(IOException e) {}
//			if(bis != null)try {fis.close();}catch(IOException e) {}
		}
	}

}
