package ex09;

import java.io.File;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:/java/dir1");
		//디렉토리 생성

//		if(f.mkdir()) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}

		/*
		if(f.delete()) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		*/
		
		if(f.renameTo(f)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
