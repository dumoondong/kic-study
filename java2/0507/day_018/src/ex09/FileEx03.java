package ex09;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("c://java//text.txt");
		
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isHidden());
		
		File f2 = new File("c:/Java/eclipse-jee-2021-03-R-win32-x86_64.zip");
		long fileSize = f2.length();
		//=>MB
		System.out.println(fileSize / (1024*1024));
		
		long fileDate = f2.lastModified();
		System.out.println(fileDate);
		System.out.println(new Date(fileDate).toLocaleString());
		
		File f3 = new File("c:/java");
		//String / File
		String[] lists = f3.list();
		System.out.println(Arrays.toString(lists));
		for(String list : lists) {
			System.out.println(list);
		}
		File[] fileLists = f3.listFiles();
		for(File fileList : fileLists) {
			System.out.println(fileList.getName());
		}
		
	}

}
