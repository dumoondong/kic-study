package ex07;

import java.io.IOException;

public class ExceptionEx09 {
	//위임의 대상 - JVM	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ProcessBuilder processBuilder
			= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe","www.daum.net");
			
		processBuilder.start();
		
	}

}
