package ex02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dir
		try {
			DirectoryStream<Path> directoryStream
				= Files.newDirectoryStream(Paths.get("."));
			
			for(Path path : directoryStream) {
				String name = path.getFileName().toString();
				System.out.println(name);
				
				long fileSize = Files.size(path);
				System.out.println(fileSize);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}
	}

}
