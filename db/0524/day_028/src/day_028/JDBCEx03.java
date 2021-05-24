package day_028;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		BufferedReader br = null;
		Connection conn = null;
		Statement stmt = null;

		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			String data = null;
			stmt = conn.createStatement();
			
			while((data=br.readLine())!= null) {	
				String[] sido1 = data.split(",");
				String sql = String.format("insert into zipcode values ('%s','%s','%s','%s','%s','%s','%s')",sido1);
				int result = stmt.executeUpdate(sql);
				System.out.println("성공:" +result);
			}
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		}finally {
			if(stmt != null)try  {stmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(br != null)try  {br.close();}catch(IOException e) {}
			
		}
	}

}
