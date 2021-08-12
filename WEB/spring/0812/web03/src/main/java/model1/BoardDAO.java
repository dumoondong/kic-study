package model1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void boardWrite() {
	}
	
	public int boardWriteOk(BoardTO to) {
		int flag = 1;
		String sql = "insert into board1 values ( 0, ?, ?, ?, ?, ?, 0, ?, now() ) ";
		int result = 1;
		if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
	
	public ArrayList<BoardTO> boardList() {
		String sql = "select seq, subject, writer, date_format(wdate, '%Y-%m-%d') wdate, hit, datediff(now(), wdate) wgap from board1 order by seq desc";
		ArrayList<BoardTO> datas = (ArrayList<BoardTO>)jdbcTemplate.query( sql, new BeanPropertyRowMapper<BoardTO>(BoardTO.class) );
		return datas;
	}
	
	public BoardTO boardView(BoardTO to) {
		String sql = "update board1 set hit = hit + 1 where seq=?";
		sql = "select subject, writer, mail, wip, wdate, hit, content from board1 where seq=?";
		return to;
	}
	
	public BoardTO boardModify(BoardTO to) {
		String sql = "select subject, writer, mail, content from board1 where seq=?";
		return to;
	}
	
	public int boardModifyOk(BoardTO to) {
		int flag = 2;
		String sql = "update board1 set subject=?, mail=?, content=? where seq=? and password=?";
		int result = 1;
		if( result == 0 ) {
			flag = 1;
		} else if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
	
	public BoardTO boardDelete(BoardTO to) {
		String sql = "select subject, writer from board1 where seq=?";
		return to;
	}
	
	public int boardDeleteOk(BoardTO to) {
		int flag = 2;
		String sql = "delete from board1 where seq=? and password=?";
		int result = 1;
		if( result == 0 ) {
			flag = 1;
		} else if( result == 1 ) {
			flag = 0;
		}
		return flag;
	}
}
