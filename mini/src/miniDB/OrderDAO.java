package miniDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class OrderDAO {
private Connection conn;
	
	public OrderDAO() {
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
	//메인 메뉴 주문
	public ArrayList<OrderTO> OrderMain(String strId,String strMain, String strMaintotalprice) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderTO> mains = new ArrayList<OrderTO>();
		try {
			String sql = "insert into mainorder(id,main,maintotalprice) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,strId);
			pstmt.setString(2,strMain);
			pstmt.setString(3,strMaintotalprice);
			
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
	//사이드 메뉴 주문
		public ArrayList<OrderTO> OrderSide(String strId,String strSide, String strSidetotalprice) {

			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			ArrayList<OrderTO> sides = new ArrayList<OrderTO>();
			try {
				String sql = "insert into sideorder(id,side,sidetotalprice) values(? ,?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,strId);
				pstmt.setString(2,strSide);
				pstmt.setString(3,strSidetotalprice);
				
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
	//메인 주문 리스트
	public ArrayList<OrderTO> Orderlist(String strId) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderTO> mains = new ArrayList<OrderTO>();
		try {
			String sql = "select * from mainorder where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderTO to = new OrderTO();
				to.setMain(rs.getString("main"));
				to.setMaintotalprice(rs.getString("maintotalprice"));
				//to.setSide(rs.getString("side"));
				//to.setSidetotalprice(rs.getString("sidetotalprice"));
				
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
	//사이드 주문 리스트
	public ArrayList<OrderTO> SideOrderlist(String strId) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderTO> mains = new ArrayList<OrderTO>();
		try {
			String sql = "select * from sideorder where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderTO to = new OrderTO();
				to.setSide(rs.getString("side"));
				to.setSidetotalprice(rs.getString("sidetotalprice"));
				
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
	//주문버튼 누르면 mainorder,sideorder 로그인에 맞는 데이터 삭제
	public ArrayList<OrderTO> DeleteOrderlist(String strId) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderTO> mains = new ArrayList<OrderTO>();
		try {
			String sql1 = "delete from mainorder where id = ?";
			
			String sql2 = "delete from sideorder where id = ?";

			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, strId);
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
	//주문 조회 // 아이디 메인 메뉴 사이드 메뉴  삽입
	public ArrayList<OrderTO> OrderQuery(OrderTO to) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderTO> sides = new ArrayList<OrderTO>();
		try {
			String sql = "insert into orderquery(id,main,mainprice,side,sideprice) values(?,?,?,?,?)";
			pstmt = pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, to.getId());
			pstmt.setString(2, to.getMain());
			pstmt.setString(3, to.getMaintotalprice());
			pstmt.setString(4, to.getSide());
			pstmt.setString(5, to.getSidetotalprice());
			
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
