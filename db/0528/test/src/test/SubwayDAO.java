package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubwayDAO {
private Connection conn;
	
	public SubwayDAO() {
		String url = "jdbc:mysql://localhost:3306/sample";
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
	public ArrayList<SubwayTO> listLocal() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SubwayTO> locals = new ArrayList<SubwayTO>();
		try {
			String sql = "select distinct local from table_subway";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			SubwayTO to = new SubwayTO();
			to.setLocal("지역");
			locals.add(to);
			while(rs.next()) {
				to = new SubwayTO();
				to.setLocal(rs.getString("local"));
				locals.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return locals;
	}
	public ArrayList<SubwayTO> listLine(String strLocal) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SubwayTO> lines = new ArrayList<SubwayTO>();
		try {
			String sql = "select distinct line from table_subway where local = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strLocal);
			
			rs = pstmt.executeQuery();
			SubwayTO to = new SubwayTO();
			to.setLine("노선");
			lines.add(to);
			while(rs.next()) {
				to = new SubwayTO();
				to.setLine(rs.getString("line"));
				lines.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return lines;
	}
	public ArrayList<SubwayTO> listSubways(String strLocal,String strLine){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SubwayTO> subways = new ArrayList<SubwayTO>();
		try {
			String sql = "select local,line,station from table_subway where local=? and line=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strLocal);
			pstmt.setString(2, strLine);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				SubwayTO to = new SubwayTO();
				to.setLocal(rs.getString("local"));
				to.setLine(rs.getString("line"));
				to.setStation(rs.getString("station"));
				subways.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
		return subways;
	}
}
