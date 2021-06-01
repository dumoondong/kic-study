

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class XMLEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbXml = new StringBuffer();
		
		BufferedReader br = null;
				
		try {
			URLConnection conn = new URL("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109").openConnection();
			br = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
			
			String xml = null;
			while( ( xml = br.readLine() ) != null ) {
				sbXml.append( xml.trim() );
			}
			
			Document doc = Jsoup.parse( sbXml.toString() );
			Elements citytagLists = doc.getElementsByTag( "city" );
			System.out.println( citytagLists.toString() );
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
