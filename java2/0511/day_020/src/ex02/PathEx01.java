package ex02;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Path path = Paths.get("./score/dat");
		Path path = Paths.get("c:/java/dir1/score.dat");

	
		
		System.out.println(path.getFileName());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(0));
		System.out.println(path.getName(1));
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		
		File f = path.toFile();
		System.out.println(f.exists());
	}

}
