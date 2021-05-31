package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class JSoupEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<html>"
				+ "<head><title>First parse</title></head>"
				  + "<body>"
				  + "<a href='https://www.daum.net'>"
				  + "<img src='./image/daum.png' />"
				  + "<div class='d1'>다음 바로가기</div>"
				  + "</a>"
				  + "<a href='https://www.naver.com'>"
				  + "<img src='./image/naver.png' />"
				  + "<div class='d1'>네이버 바로가기</div>"
				  + "</a>"
				  + "<a href='https://www.google.com'>"
				  + "<img src='./image/google.png' />"
				  + "<div class='d1'>구글 바로가기</div>"
				  + "</a>"
				  + "</body></html>";
		
		Document doc = Jsoup.parse(html);
		//System.out.println(doc.toString());
		
//		Elements alists = doc.select("a[href]");
//		System.out.println(alists.toString());
		
//		Elements alists = doc.select("a[href=https://www.daum.net]");
//		System.out.println(alists.toString());
		
//		Elements alists = doc.select("a[href$=com]");
//		System.out.println(alists.toString());
		
//		Elements imglists = doc.select("img[src$=png]");
//		System.out.println(imglists.toString());
		
		Elements divtagList = doc.select("a .d1");
		System.out.println(divtagList.toString());
	}

}
