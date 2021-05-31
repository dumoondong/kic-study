package day_033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class NewsEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("https://news.daum.net/ranking/kkomkkom/").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			while((line=br.readLine())!=null) {
				if(line.contains("class=\"list_news2\"")) {
					while(true) {
						line = br.readLine().trim();
						if(line.contains("class=\"box_info\"")) {
							break;
						}
						//data reading
						if(line.contains("<a") && line.contains("class=\"link_txt\"")) {
							System.out.println(line);
						}
						//출처
						if(line.contains("<span") && line.contains("class=\"info_news\"")) {
							System.out.println(line);
						}
						//본문
						if(line.contains("<span") && line.contains("class=\"link txt\"") ) {
							line=br.readLine();
							System.out.println(line);
						}
						
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
