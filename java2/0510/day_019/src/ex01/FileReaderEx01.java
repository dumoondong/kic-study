package ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		
		try {
			fr = new FileReader("c:/java/test.txt");
			int data = 0;
			while((data=fr.read())!= -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null)try {fr.close();}catch(IOException e) {}
		}
	}

}
