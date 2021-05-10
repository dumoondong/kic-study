package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw =null;
		try {
			//overwriting
			//fw = new FileWriter("./newtest.txt");
			//append
			fw = new FileWriter("./newtest.txt", true);
			
			fw.write("123\r\n");
			fw.write("abc");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}finally {
			if(fw != null) try { fw.close();} catch(IOException e) {}
		}
	}

}
