package ex03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchZipcodeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			String address = null;
			String sido = "";
			while( ( address = br.readLine() ) != null ) {
				String[] addresses = address.split( "," );
				if( !addresses[1].equals( sido ) ) {
					sido = addresses[1];
					System.out.println( "----------------" );
				}
				System.out.println( address );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "에러 : " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "에러 : " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
