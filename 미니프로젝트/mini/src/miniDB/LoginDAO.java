package miniDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import customerUI.LoginJoin;

public class LoginDAO {
private Connection conn;
private boolean check = false;
	public LoginDAO() {
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
	//손님 로그인 검사
	public boolean customorJoin(String id,String password){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select id, password from customor";	
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getString("id").equals(id) && rs.getString("password").equals(password)) {
					check = true;
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e1.getMessage());
		}finally {
			if(rs != null)try  {rs.close();}catch(SQLException e1) {}
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e1) {}
			if(conn != null)try  {conn.close();}catch(SQLException e1) {}
		}
		return check;
	}
	//관리자 로그인 검사
	public boolean ManagerJoin(String id,String password){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select id, password from customor where rank ='관리자' ";	
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getString("id").equals(id) && rs.getString("password").equals(password)) {
					check = true;
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e1.getMessage());
		}finally {
			if(rs != null)try  {rs.close();}catch(SQLException e1) {}
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e1) {}
			if(conn != null)try  {conn.close();}catch(SQLException e1) {}
		}
		return check;
	}
	
}
