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

public class DeptDAO {
	private DataSource dataSource;
	
	public DeptDAO() {
		// TODO Auto-generated constructor stub
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
			this.dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb2" );
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
		
	}
	public ArrayList<DeptTO> listDept(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<DeptTO> datas = new ArrayList<DeptTO>();
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "select * from dept";
			pstmt = conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				DeptTO to = new DeptTO();
				to.setDeptno(rs.getString("deptno"));
				to.setDname(rs.getString("dname"));
				to.setLoc(rs.getString("loc"));
				
				datas.add(to);
			}
			
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		}finally {
			if(rs != null) try { rs.close();} catch(SQLException e) {}
			if(pstmt != null) try { pstmt.close();} catch(SQLException e) {}
			if(conn != null) try { conn.close();} catch(SQLException e) {}
		}
		
		return datas;
	}
}
