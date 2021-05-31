package jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsDAO02 {
	
	public NewsDAO02() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<NewsTO> newsLists() {
		ArrayList<NewsTO> newsLists = new ArrayList<NewsTO>();
		//전체 html 데이터 저장
		StringBuffer sbHtml = new StringBuffer();
		
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("https://news.daum.net/ranking/kkomkkom/").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String html = null;
			while((html=br.readLine()) != null) {
				sbHtml.append(html);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] :"+e.getMessage());
		}finally {
			if(br !=null)try {br.close();}catch(IOException e) {}
		}
		
		//html 파싱
		Document doc = Jsoup.parse(sbHtml.toString());
		NewsTO to1 = new NewsTO();
		Elements litagLists = doc.select("li[data-tiara-layer=news_list]");
		//System.out.println(litagLists.toString());
		for(Element litag : litagLists) {
			Elements subjectLists = litag.select("a.link_txt");
			//System.out.println(subjectLists.toString());
			//System.out.println(subjectLists.text());
			Elements sourceLists = litag.select("span.info_news");
			//System.out.println(sourceLists.text());
			Elements contentLists = litag.select("span.link_txt");
			//System.out.println(contentLists.text());
			to1.setSource(subjectLists.text());
			to1.setSubject(sourceLists.text());
			to1.setContent(contentLists.text());		
			newsLists.add(to1);
		}
		
		return newsLists;
	}
}
