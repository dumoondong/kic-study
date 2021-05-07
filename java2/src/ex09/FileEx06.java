package ex09;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f3 = new File("c:/java");
		

		
		File[] fileLists = f3.listFiles();
		for(File fileList : fileLists) {
			long fileDate = fileList.lastModified();
			long fileSize = fileList.length();
			if(fileList.isDirectory()) {
				System.out.println(new Date(fileDate).toLocaleString()+"      <DIR>               "+"["+fileList.getName()+"]");
			}else {
				System.out.println(new Date(fileDate).toLocaleString()+"              "+fileSize+" "+fileList.getName());
			}
		}
	}
}
