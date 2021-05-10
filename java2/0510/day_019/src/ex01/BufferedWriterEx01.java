package ex01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedWriter bw =null;
		try {
			//overwriting
			//fw = new FileWriter("./newtest.txt");
			//append
			bw = new BufferedWriter(new FileWriter("./newtest.txt", true));
			
			bw.write("123\r\n");
			bw.write("abc\r\n");
			bw.write("123\r\n");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}finally {
			if(bw != null) try { bw.close();} catch(IOException e) {}
		}
	}

}
