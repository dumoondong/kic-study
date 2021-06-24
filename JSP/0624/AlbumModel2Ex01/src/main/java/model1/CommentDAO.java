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

public class CommentDAO {
	private DataSource dataSource;
	
	public CommentDAO() {
		// TODO Auto-generated constructor stub
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
			this.dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
	}
	
	public ArrayList<CommentTO> commentList(CommentTO cto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<CommentTO> datas = new ArrayList<CommentTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select seq, writer, content, wdate from album_comment1 where pseq = ? order by seq";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, cto.getPseq() );
			
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				CommentTO to = new CommentTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setWriter( rs.getString( "writer" ) );
				to.setContent( rs.getString( "content" ) );
				to.setWdate( rs.getString( "wdate" ) );
				
				datas.add( to );
			}
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}
		return datas;
	}
	
	public int commentWriteOk(CommentTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 1;
		try {		
			conn = this.dataSource.getConnection();
			
			String sql = "insert into album_comment1 values (0, ?, ?, ?, ?, now())";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getPseq() );
			pstmt.setString( 2, to.getWriter() );
			pstmt.setString( 3, to.getPassword() );
			pstmt.setString( 4, to.getContent() );
			
			int result = pstmt.executeUpdate();
			if( result == 1 ) {
				sql = "update album_board1 set cmt=cmt+1 where seq=?";
				pstmt = conn.prepareStatement( sql );
				pstmt.setString( 1, to.getPseq() );
				
				pstmt.executeUpdate();
				
				flag = 0;
			}
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}
		return flag;
	}
}
