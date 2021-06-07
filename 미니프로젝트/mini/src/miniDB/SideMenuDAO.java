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
	// 콤보박스 사이드 목록 검색
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
	//메뉴판 사이드 검색
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
	//사이드 테이블 목록 추가
	public ArrayList<SideMenuTO> searchSide(String strSide) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "select * from side where side = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSide);
			
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
	//사이드 메뉴 추가
	public ArrayList<SideMenuTO> InsertSide(String strSide,String strSideprice) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "insert side value (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strSide);
			pstmt.setString(2,strSideprice);
			
			rs = pstmt.executeQuery();
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
	//사이드 메뉴 삭제
	public ArrayList<SideMenuTO> deleteSide(String strSide) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "delete from side where side = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strSide);
			
			rs = pstmt.executeQuery();
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
	//사이드 메뉴 수정
	public ArrayList<SideMenuTO> updateSide(String strSide,String strSideprice) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SideMenuTO> sides = new ArrayList<SideMenuTO>();
		try {
			String sql = "update side set sideprice = ? where side = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strSideprice);
			pstmt.setString(2,strSide);
			
			rs = pstmt.executeQuery();
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
