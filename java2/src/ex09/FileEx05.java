package ex09;

import java.io.File;
import java.io.IOException;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			File f = new File("c:/java/test.txt");
			try {
				f.createNewFile();
				System.out.println("성공");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("에러:" + e.getMessage());
			} 
	}

}
