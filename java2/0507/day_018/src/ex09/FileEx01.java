package ex09;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일(디렉토리) => File
		//경로( 절대경로(드라이브명) / 상대경로(현재파일))
		//존재하지 않는 파일로도 객체 생성가능
		
		//windows
		File f1 = new File("C:\\java\\");
		//linux
		File f2 = new File("C:/java/");
		File f3 = new File("C:\\java\\text.txt");
		
		//존재유무
		System.out.println(f1.exists());
		System.out.println(f3.exists());
		
		//파일이나 디렉토리 구분
		System.out.println(f1.isDirectory());
		System.out.println(f3.isFile());
	}

}
