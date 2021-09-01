package com.example.bootweb01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LoginDAO {
	@Autowired
	private DataSource dataSource;

	public int memberJoinOk(MemberTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int flag = -2;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from member where id=? ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getId() );
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("password").equals(to.getPassword())) {
					if(rs.getString("grade").equals("관리자")) {
						to.setGrade( rs.getString( "grade" ) );
						flag = 2;
					}else {
						flag = 0;
					}
				}else {
					flag = 1;
				}
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return flag;
	}
	
	public int idcheck(MemberTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int flag = -2;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from member where id=? ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getId() );
			
			System.out.println(to.getId());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("id").equals(to.getId())) {					
					flag = 0;
				}else {
					flag = 1;
				}
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return flag;
	}
	
	public int regiOk(MemberTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int flag = 2;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "insert into member values ( 0, ?, ?, '일반회원', ?, ?, ?, 0,0  ) ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getId() );
			pstmt.setString( 2, to.getPassword() );
			pstmt.setString( 3, to.getPhone() );
			pstmt.setString( 4, to.getEmail() );
			pstmt.setString( 5, to.getName() );
			
			int result = pstmt.executeUpdate();
			if( result == 1 ) {
				flag = 0;
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return flag;
	}
}
