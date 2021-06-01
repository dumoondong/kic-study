

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String strJson = "{ \"data1\": \"value1\", \"data2\": \"value2\"}";
		//String strJson = "{ \"data1\": [8, 9, 6, 2, 9] }";
		String strJson = "{ \"data1\": { \"data11\": \"value11\", \"data12\": \"value12\"} }";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject object = (JSONObject)parser.parse( strJson );
			
			/*
			String data1 = (String)object.get( "data1" );
			System.out.println( data1 );
			String data2 = (String)object.get( "data2" );
			System.out.println( data2 );
			*/
			
			/*
			JSONArray array = (JSONArray)object.get( "data1" );
			for( int i=0 ; i<array.size(); i++ ) {
				System.out.println( array.get(i) );
			}
			*/
			
			JSONObject childObject = (JSONObject)object.get( "data1" );
			System.out.println( (String)childObject.get("data11") );
			System.out.println( (String)childObject.get("data12") );
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
		
		
	}

}
