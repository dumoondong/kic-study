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
public class AdminDAO {
	@Autowired
	private DataSource dataSource;
	//대코드 리스트
	public ArrayList<LargecodeTO> LargecodeList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<LargecodeTO> datas = new ArrayList<LargecodeTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from largecode";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				LargecodeTO to = new LargecodeTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setLargecode( rs.getString( "largecode" ) );
				to.setLargeinfo( rs.getString( "largeinfo" ) );
				to.setLargeremark(rs.getString( "largeremark" ));
				
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
	//대코드수정
	public LargecodeTO decodeedit(LargecodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from largecode where seq=? ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getSeq() );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				to.setLargecode(rs.getString("largecode"));
				to.setLargeinfo( rs.getString( "largeinfo" ) );
				to.setLargeremark( rs.getString( "largeremark" ) );
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return to;
	}
	//대코드 수정 확인
	public int decodeedit_ok(LargecodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "update largecode set largeinfo=?, largeremark=? where seq=?";
			pstmt = conn.prepareStatement( sql );
			
			pstmt.setString( 1, to.getLargeinfo() );
			pstmt.setString( 2, to.getLargeremark() );
			pstmt.setString( 3, to.getSeq() );
			
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return flag;
	}
	//대코드 삭제
	public int decodedelete_ok(LargecodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "delete from largecode where seq=?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getSeq() );
			System.out.println(to.getSeq());
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
			}
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}

		return flag;
	}
	//대코드 추가
	public int decodewrite(LargecodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "insert into largecode values (0,?, ?, ?)";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getLargecode() );
			pstmt.setString( 2, to.getLargeinfo() );
			pstmt.setString( 3, to.getLargeremark() );
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
			}
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}

		return flag;
	}
	
	//소코드
	public ArrayList<SmallcodeTO> smallcodeList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SmallcodeTO> datas = new ArrayList<SmallcodeTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from smallcode";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				SmallcodeTO to = new SmallcodeTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setSmallcode( rs.getString( "smallcode" ) );
				to.setSmallinfo( rs.getString( "smallinfo" ) );
				to.setSmallremark(rs.getString( "smallremark" ));
				
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
	//대코드로 소코드테이블 리스트 찾기
	public ArrayList<SmallcodeTO> search_de(String largecode) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SmallcodeTO> datas = new ArrayList<SmallcodeTO>();
		
		try {
			conn = this.dataSource.getConnection();
			String sql = "select * from smallcode where smallcode like ?";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			pstmt.setString( 1, "%"+largecode+"%" );
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				SmallcodeTO to = new SmallcodeTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setSmallcode( rs.getString( "smallcode" ) );
				to.setSmallinfo( rs.getString( "smallinfo" ) );
				to.setSmallremark(rs.getString( "smallremark" ));
				
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
	//소코드수정
	public SmallcodeTO commoncodeEdit(SmallcodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from smallcode where seq=? ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getSeq() );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				to.setSmallcode(rs.getString("smallcode"));
				to.setSmallinfo( rs.getString( "smallinfo" ) );
				to.setSmallremark( rs.getString( "smallremark" ) );
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return to;
	}
	//소코드 수정 확인
	public int commoncodeEdit_ok(SmallcodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "update smallcode set smallinfo=?, smallremark=? where seq=?";
			pstmt = conn.prepareStatement( sql );
			
			pstmt.setString( 1, to.getSmallinfo() );
			pstmt.setString( 2, to.getSmallremark() );
			pstmt.setString( 3, to.getSeq() );
			
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return flag;
	}
	//소코드 삭제
	public int commoncodeDelete_ok(SmallcodeTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "delete from smallcode where seq=?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getSeq() );
			System.out.println(to.getSeq());
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
			}
		} catch( SQLException e ) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}

		return flag;
	}
	//소코드 추가
		public int commoncodeWrite(SmallcodeTO to) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			int flag = 0;
			try {
				conn = this.dataSource.getConnection();
				
				String sql = "insert into smallcode values (0,?, ?, ?)";
				pstmt = conn.prepareStatement( sql );
				pstmt.setString( 1, to.getSmallcode() );
				pstmt.setString( 2, to.getSmallinfo() );
				pstmt.setString( 3, to.getSmallremark() );
				int result = pstmt.executeUpdate();
				if( result == 0 ) {
					flag = 1;
				}
			} catch( SQLException e ) {
				System.out.println( "[에러] " + e.getMessage() );
			} finally {
				if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
				if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
			}

			return flag;
		}
	//회원
	public ArrayList<MemberTO> management() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberTO> datas = new ArrayList<MemberTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from member";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				MemberTO to = new MemberTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setId(rs.getString("id"));
				to.setGrade(rs.getString("grade"));
				to.setName(rs.getString("name"));
				to.setPhone(rs.getString("phone"));
				to.setEmail(rs.getString("email"));
				
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
	//회원관리 소코드 리스트
	public ArrayList<SmallcodeTO> managementcodeList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SmallcodeTO> datas = new ArrayList<SmallcodeTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from smallcode where smallcode like 'mg%'";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				SmallcodeTO to = new SmallcodeTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setSmallcode( rs.getString( "smallcode" ) );
				to.setSmallinfo( rs.getString( "smallinfo" ) );
				
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
	//회원정보 일치 리스트 
	public ArrayList<MemberTO> search_gr(String smallinfo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberTO> datas = new ArrayList<MemberTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from member where grade like ?";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			pstmt.setString( 1, "%"+smallinfo+"%" );
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				MemberTO to = new MemberTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setId(rs.getString("id"));
				to.setGrade(rs.getString("grade"));
				to.setName(rs.getString("name"));
				to.setPhone(rs.getString("phone"));
				to.setEmail(rs.getString("email"));
				
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
	//회원정보수정
	public MemberTO memberedit(MemberTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from member where seq=? ";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, to.getSeq() );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				to.setId( rs.getString( "id" ) );
				to.setGrade( rs.getString( "grade" ) );
				to.setPhone( rs.getString( "phone" ) );
				to.setEmail( rs.getString( "email" ) );
				to.setName( rs.getString( "name" ) );
			}
		} catch( SQLException e ) {
			System.out.println("[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}	
		return to;
	}
	//회원정보수정 등급 리스트 출력
	public ArrayList<SmallcodeTO> memberGrade() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<SmallcodeTO> datas = new ArrayList<SmallcodeTO>();
		
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "select * from smallcode where smallcode like 'MG%'";
			pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				SmallcodeTO to = new SmallcodeTO();
				to.setSeq( rs.getString( "seq" ) );
				to.setSmallcode( rs.getString( "smallcode" ) );
				to.setSmallinfo( rs.getString( "smallinfo" ) );
				to.setSmallremark(rs.getString( "smallremark" ));
				
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
	//회원정보 수정 확인
	public int memberedit_ok(MemberTO to) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		try {
			conn = this.dataSource.getConnection();
			
			String sql = "update member set id=?, name=?, phone=?,email=?,grade=? where seq=?";
			pstmt = conn.prepareStatement( sql );
			System.out.println(to.getId());
			System.out.println(to.getName());
			System.out.println(to.getPhone());
			System.out.println(to.getEmail());
			System.out.println(to.getGrade());
			System.out.println(to.getSeq());
			pstmt.setString( 1, to.getId() );
			pstmt.setString( 2, to.getName() );
			pstmt.setString( 3, to.getPhone() );
			pstmt.setString( 4, to.getEmail() );
			pstmt.setString( 5, to.getGrade() );
			pstmt.setString( 6, to.getSeq() );
			
			int result = pstmt.executeUpdate();
			if( result == 0 ) {
				flag = 1;
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
