package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyfileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("./Jellyfish.jpg");
			fos = new FileOutputStream("./newJellyfish.jpg");
			int data = 0;
			//파일 내용 복사 
			while ((data = fis.read()) != -1){
				fos.write(data);
			}
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(fos != null) try { fos.close();}catch(IOException e) {}
			if(fis != null) try { fis.close();}catch(IOException e) {}
		}
	}

}
