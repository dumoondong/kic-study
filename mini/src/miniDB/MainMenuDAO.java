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
	//콤보박스 메인 메뉴 검색
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
	//메뉴판 메뉴 검색
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
	//주문 테이블 목록 추가
	public ArrayList<MainMenuTO> searchMain(String strMain) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "select * from main where main = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strMain);
			
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
	//메인 메뉴 추가
	public ArrayList<MainMenuTO> InsertMain(String strMain, String strMainprice) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "insert main value (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strMain);
			pstmt.setString(2,strMainprice);
			
			rs = pstmt.executeQuery();

			

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
	//메인 메뉴 삭제
	public ArrayList<MainMenuTO> deleteMain(String strMain) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "delete from main where main = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strMain);
			
			rs = pstmt.executeQuery();

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
	//메인 메뉴 수정
	public ArrayList<MainMenuTO> updateMain(String strMain,String strMainprice) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MainMenuTO> mains = new ArrayList<MainMenuTO>();
		try {
			String sql = "update main set mainprice = ? where main = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strMainprice);
			pstmt.setString(2,strMain);
			
			rs = pstmt.executeQuery();
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
