package model1;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void boardWrite() {
	}
	
	public int boardWriteOk(BoardTO to) {
		int flag = 1;
		int result = 1;
		if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
	
	public ArrayList<BoardTO> boardList() {
		ArrayList<BoardTO> datas = (ArrayList)sqlSession.selectList( "list" );
		return datas;
	}
	
	public BoardTO boardView(BoardTO to) {
		sqlSession.update( "view_hit", to );
		to = sqlSession.selectOne( "view", to );
		return to;
	}
	
	public BoardTO boardModify(BoardTO to) {
		return to;
	}
	
	public int boardModifyOk(BoardTO to) {
		int flag = 2;
		int result = 1;
		if( result == 0 ) {
			flag = 1;
		} else if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
	
	public BoardTO boardDelete(BoardTO to) {
		return to;
	}
	
	public int boardDeleteOk(BoardTO to) {
		int flag = 2;
		int result = 1;
		if( result == 0 ) {
			flag = 1;
		} else if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
}
