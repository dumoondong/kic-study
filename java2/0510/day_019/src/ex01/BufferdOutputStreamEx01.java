package ex01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("./newtest.txt"));
			bos.write('a');
			bos.write('b');
			bos.write('c');
			
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : "+e.getMessage());
		}finally {
			if(bos != null) try{bos.close(); }catch(IOException e) {}
		}
		
	}

}
