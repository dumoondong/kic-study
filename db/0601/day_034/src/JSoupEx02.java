

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JSoupEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document doc = null;
		
		try {
			//doc = Jsoup.connect( "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109" ).get();
			doc = Jsoup.connect( "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp" )
					.data("stnId", "109")
					.get();
			//System.out.println( doc.toString() );
			
			Elements citytagLists = doc.getElementsByTag( "city" );
			System.out.println( citytagLists.toString() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
	}
}
