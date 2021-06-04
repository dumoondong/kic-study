package miniDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SideMenuDAO {
private Connection conn;
	
	public SideMenuDAO() {
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
	public ArrayList<SideMenuTO> listSide() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "select side from side";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			SideMenuTO to = new SideMenuTO();
			to.setSide("사이드");
			sides.add(to);
			while(rs.next()) {
				to = new SideMenuTO();
				to.setSide(rs.getString("side"));
				sides.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return sides;
	}
	public ArrayList<SideMenuTO> listSideMenu() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "select * from side";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				SideMenuTO to = new SideMenuTO();;
				to.setSide(rs.getString("side"));
				to.setSideprice(rs.getString("sideprice"));
				sides.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return sides;
	}
}
