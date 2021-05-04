package ex01;

import java.io.IOException;

public class ProcessBuilderEx01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder processBuilder
			= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe","www.daum.net");
		processBuilder.start();

		ProcessBuilder processBuilder1
		= new ProcessBuilder("C:\\WINDOWS\\system32\\notepad.exe");
	processBuilder1.start();
	}

}
