

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JSONEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL( "http://www.kma.go.kr/DFSROOT/POINT/DATA/top.json.txt").openConnection();
			br = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
					
			String json = null;
			while( ( json = br.readLine() ) != null ) {
				System.out.println( json );
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
