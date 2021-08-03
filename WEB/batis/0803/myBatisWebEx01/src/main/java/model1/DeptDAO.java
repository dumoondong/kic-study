package model1;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptDAO {
	private SqlSession sqlSession;
	public DeptDAO() {
		// TODO Auto-generated constructor stub
		String resource = "myBatisConfig.xml";
		
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			this.sqlSession = sqlSessionFactory.openSession(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] :" + e.getMessage());
		}finally {
			if(is != null)try {is.close();}catch(IOException e) {}
		}
		
	}
	
	public ArrayList<DeptTO> selectList(){
		ArrayList<DeptTO> lists =(ArrayList)sqlSession.selectList("selectlist1");
		if(sqlSession != null) sqlSession.close();
		return lists;
	}
}
