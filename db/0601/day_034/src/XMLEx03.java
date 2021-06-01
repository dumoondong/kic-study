

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class XMLEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
				
		try {
			URLConnection conn = new URL("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109").openConnection();
			br = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
			
			// 문자열 ... 처리
			String xml = null;
			while( ( xml = br.readLine() ) != null ) {
				if( xml.trim().startsWith("<city") ) {
					System.out.println( xml.trim() );
				}
			}
			
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
