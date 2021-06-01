

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL( "http://www.kma.go.kr/DFSROOT/POINT/DATA/top.json.txt").openConnection();
			br = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );

			//StringBuffer sbJson = new StringBuffer();
			
			//String json = null;
			//while( ( json = br.readLine() ) != null ) {
			//	sbJson.append( json );
			//}
			
			JSONParser parser = new JSONParser();

			//JSONArray arrays = (JSONArray)parser.parse( sbJson.toString() );
			JSONArray arrays = (JSONArray)parser.parse( br );
			
			//System.out.println( arrays.toString() );
			for( int i=0 ; i<arrays.size() ; i++ ) {
				JSONObject object = (JSONObject)arrays.get(i);
				System.out.printf( "%s : %s\n",
					(String)object.get( "code" ), (String)object.get( "value" ) );
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
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
