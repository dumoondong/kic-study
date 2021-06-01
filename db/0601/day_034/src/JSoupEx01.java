

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JSoupEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document doc = null;
		
		try {
			doc = Jsoup.connect( "https://m.daum.net" ).get();
			//System.out.println( doc.toString() );
			
			Elements titletagList = doc.getElementsByTag("title");
			System.out.println( titletagList.toString() );
			
			String title = doc.title();
			System.out.println( title );
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
		
		
	}

}
