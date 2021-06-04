package miniDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainMenuDAO {
private Connection conn;
	
	public MainMenuDAO() {
		String url = "jdbc:mysql://localhost:3306/project";
		String user = "root";
		String password = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}
	}
	public ArrayList<MainMenuTO> listMain() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "select main from main";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			MainMenuTO to = new MainMenuTO();
			to.setMain("메인");
			mains.add(to);
			while(rs.next()) {
				to = new MainMenuTO();
				to.setMain(rs.getString("main"));
				mains.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return mains;
	}
	public ArrayList<MainMenuTO> listMenu() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "select * from main";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MainMenuTO to = new MainMenuTO();
				to.setMain(rs.getString("main"));
				to.setMainprice(rs.getString("mainprice"));
				
				mains.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return mains;
	}
}
