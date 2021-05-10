package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			//fos = new FileOutputStream("c:/java/newtext.txt");
			//현재 디렉토리(class 디렉토리)
			fos = new FileOutputStream("./newtext.txt");
			
			//overwriting - 지웠다가 다시 쓰기
			fos.write('1');
			fos.write('2');
			
			//fos.write('\r');
			fos.write('\n');
			
			fos.write('a');
			fos.write('b');
			
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:" + e.getMessage());
		}finally {
			if(fos != null) try { fos.close();}catch(IOException e) {}
		}
	}

}
