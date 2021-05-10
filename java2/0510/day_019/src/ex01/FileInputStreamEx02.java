package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InputStream(1byte) - File =>
		
		FileInputStream fis = null;
		
		try {
			//fis = new FileInputStream("c:/java/test.txt");
			fis = new FileInputStream("./newtext.txt");
			int data = 0;
			//엔터키
			//윈도우 \r\n
			//리눅스 \n
			while((data = fis.read() ) != -1) {
				if(data == '\r') {
					System.out.print("(r)");
				}else if(data == '\n') {
					System.out.print("(n)");
				}else {
					System.out.print((char)data);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		}finally {
			if( fis!=null)try {fis.close(); } catch(IOException E) {}
		}
	}

}
