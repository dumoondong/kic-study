

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertZipcodeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into zipcode values (?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String sentence = null;
			int count = 1;
			while( ( sentence = br.readLine() ) != null ) {
				String[] addresses = sentence.split( "," );
				
				pstmt.setString(1, addresses[0]);
				pstmt.setString(2, addresses[1]);
				pstmt.setString(3, addresses[2]);
				pstmt.setString(4, addresses[3]);
				pstmt.setString(5, addresses[4]);
				pstmt.setString(6, addresses[5]);
				pstmt.setString(7, addresses[6]);
				
				count += pstmt.executeUpdate();
			}
			
			System.out.println( "결과 : " + count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		
			if( br != null ) try { br.close(); } catch(IOException e) {};
			
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {};
			if( conn != null ) try { conn.close(); } catch(SQLException e) {};
		}
	}

}
