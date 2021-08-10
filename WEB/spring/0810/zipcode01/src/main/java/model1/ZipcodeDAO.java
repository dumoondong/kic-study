package model1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ZipcodeDAO {
	private DataSource dataSource = null;
	
	public ZipcodeDAO() {
		// TODO Auto-generated constructor stub	
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
			this.dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb1" );
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
	}
	
	public ArrayList<ZipcodeTO> searchLists(String strDong) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> lists = new ArrayList<ZipcodeTO>();
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, strDong + "%" );
				
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				ZipcodeTO to = new ZipcodeTO();
				to.setZipcode( rs.getString( "zipcode" ) );
				to.setSido( rs.getString( "sido" ) );
				to.setGugun( rs.getString( "gugun" ) );
				to.setDong( rs.getString( "dong" ) );
				to.setRi( rs.getString( "ri" ) );
				to.setBunji( rs.getString( "bunji" ) );
				
				lists.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[예외] : " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		return lists;
	}
}




