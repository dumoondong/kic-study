package ex01;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("c:/java/test.txt"));
			int data = 0;
			//1자씩 ...
			while((data=br.read())!= -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
		}
	}

}
