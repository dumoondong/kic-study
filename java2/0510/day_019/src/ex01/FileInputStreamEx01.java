package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InputStream(1byte) - File =>
		
		FileInputStream fis = null;
		
		try {
			//fis = new FileInputStream("c:/java/test.txt");
			fis = new FileInputStream("./newtext.txt");
			// 1byte 읽어들임
//			int data = fis.read();
//			System.out.println("data : "+(char)data);
//			data = fis.read();
//			System.out.println("data : "+(char)data);
//			data = fis.read();
//			System.out.println("data : "+(char)data);
//			data = fis.read();
			byte[] datas = new byte[5];
			fis.read(datas);
			System.out.println((char)datas[0]);
			System.out.println((char)datas[4]);
			
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
