package ex01;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./newgugudan.txt"));
			
			String data = null;
			//1줄씩
			while((data=br.readLine())!= null) {
				System.out.println(data);
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
