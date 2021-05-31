package day_033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class NewsEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("https://news.daum.net/").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			while((line=br.readLine())!=null) {
				if(line.contains("data-tiara-layer=\"MAIN_NEWS\"")) {
					while(true) {
						line = br.readLine();
						if(line.contains("data-tiara-layer=\"PHOTO\"")) {
							break;
						}
						System.out.println(line);
					}
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러" +e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러" +e.getMessage());
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
		}
		
	}

}
