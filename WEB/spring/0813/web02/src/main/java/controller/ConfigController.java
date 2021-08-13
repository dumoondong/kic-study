package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model1.ExampleDAO;
import model1.ZipcodeTO;
import share.ShareClass;

@Controller
public class ConfigController {
	@Autowired
	private ShareClass shareClass;
	@Autowired
	private ExampleDAO dao;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/mybatis.do")
	public String mybatis() {
		System.out.println("mybatis() 호출 :" +sqlSession);
		
		String result = sqlSession.selectOne("selectNow");
		System.out.println("결과 : "+result);
		
		return "mybatis";
	}
	
	@RequestMapping("/jdbc.do")
	public String jdbc() {
		
		System.out.println(dao.selectNow());
		
		return "jdbc";
	}
	
	@RequestMapping("/jdbc2.do")
	public String jdbc2() {
		
		System.out.println("jdbc2()호출 " + jdbcTemplate);
		
		//String result = jdbcTemplate.queryForObject("select now()", String.class);
		
		// 1행 1열
		//String result = jdbcTemplate.queryForObject("select zipcode from zipcode where zipcode=?", new Object[] {"305-806"}, String.class);
		
		//1행 다열
		/*
		ZipcodeTO to = jdbcTemplate.queryForObject(
					"select * from zipcode where zipcode=?", 
					new Object[] {"305-806"}, 
					new ZipcodeMapper() );
		
		System.out.println(to.getZipcode());
		System.out.println(to.getSido());
		*/
		//다행 다열
		List<ZipcodeTO> lists = jdbcTemplate.query(
				"select * from zipcode where dong = ?", 
				new Object[] {"신사동"},
				new ZipcodeMapper() );
		
		System.out.println(lists.size());
		for(ZipcodeTO to : lists) {
			System.out.println(to.getZipcode());
			System.out.println(to.getSido());
			System.out.println(to.getDong());
		}
		return "jdbc";
	}
	
	public class ZipcodeMapper implements RowMapper<ZipcodeTO> {

		@Override
		public ZipcodeTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			ZipcodeTO to = new ZipcodeTO();
			
			to.setZipcode(rs.getString("zipcode"));
			to.setSido(rs.getString("sido"));
			to.setGugun(rs.getString("gugun"));
			to.setDong(rs.getString("dong"));
			to.setRi(rs.getString("ri"));
			to.setBunji(rs.getString("bunji"));
			
			return to;
		}
		
	}
	
	@RequestMapping("/list1.do")
	public String list1() {
		System.out.println("list1() 호출" + shareClass);
		System.out.println("list1() 호출" + shareClass.getShareData1());
		
		shareClass.setShareData1("list1에서 변경된자료");
		return "listview1";
	}
	
	@RequestMapping("/list2.do")
	public String list2() {
		System.out.println("list2() 호출" +shareClass.getShareData1());
		
		shareClass.setShareData1("list1에서 변경된자료");
		return "listview2";
	}
	
	@RequestMapping("/upload.do")
	public String upload() {

		return "upload";
	}
	
	@RequestMapping("/upload_ok.do")
	public String upload_ok(HttpServletRequest request) {
		String uploadPath = "C:/JSP/framwork.workspace/web02/src/main/webapp/upload";
		int maxFileSize = 1024*1024*2;
		String encType = "utf-8";
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest(request, uploadPath, maxFileSize,encType, new DefaultFileRenamePolicy() );
			System.out.println(multi.getOriginalFileName("upload"));
			System.out.println(multi.getFilesystemName("upload"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}
		
		return "upload_ok";
	}
	
}
