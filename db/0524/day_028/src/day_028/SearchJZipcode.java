package day_028;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchJZipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
				
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하시오 : ");
		String sido = sc.next();	
		if(sido.length()<=1 ) {
			System.out.print("다시입력하시오 : ");
			sido = sc.next();	
		}
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			conn = DriverManager.getConnection(url, user, password);
			
			stmt = conn.createStatement();
			String sql = String.format("select * from zipcode where dong like '%"+sido+"%'");
			int result = stmt.executeUpdate(sql);
			//select
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		}finally {
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
			if(stmt != null)try  {stmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
		}
	}

}
