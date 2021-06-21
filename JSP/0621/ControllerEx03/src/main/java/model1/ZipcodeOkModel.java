package model1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ZipcodeOkModel implements ZipcodeModel {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String strDong = request.getParameter( "dong" );
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> lists = new ArrayList<String>();
		
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context)initCtx.lookup("java:comp/env");
			DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb2");
			
			conn = dataSource.getConnection();
			
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString(1, strDong + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String zipcode = rs.getString( "zipcode" );
				String sido = rs.getString( "sido" );
				String gugun = rs.getString( "gugun" );
				String dong = rs.getString( "dong" );
				String ri = rs.getString( "ri" );
				String bunji = rs.getString( "bunji" );
				
				//System.out.println( zipcode );
				String address = String.format("[%s] %s %s %s %s %s", zipcode,sido,gugun,dong,ri,bunji);
				
				lists.add(address);
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		
		request.setAttribute("lists", lists);
	}

}










