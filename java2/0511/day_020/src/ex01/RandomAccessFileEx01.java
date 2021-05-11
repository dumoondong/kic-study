package ex01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RandomAccess
		RandomAccessFile raf = null;
		
		//read/write
		//읽기 위치: 파일 포인터
		try {
			raf = new RandomAccessFile("./score.dat", "rw");
			
			int[] scores = {
					1,100,90,90,
					2,70,90,100,
					3,100,1000,100,
					4,70,60,80,
					5,70,90,100
			};
			
			for(int i=0; i<scores.length; i++) {
				raf.writeInt(scores[i]);
				System.out.println(raf.getFilePointer());
			}
			System.out.println("출력성공");
			
			raf.seek(8);
			while(true) {
				System.out.println(raf.readInt());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(raf != null)try {raf.close();}catch(IOException e) {}
		}
	}

}
