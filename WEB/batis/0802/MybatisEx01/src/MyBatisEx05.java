import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "myBatisConfig.xml";
		
		InputStream is = null;
		SqlSession sqlSession = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			System.out.println("설정이 성공적으로 호출됨");
			
			sqlSession = sqlSessionFactory.openSession();
			System.out.println("데이터베이스와 연결됨");
			
			//List<DeptTO> lists = sqlSession.selectList("selectlist1");
			//List<DeptTO> lists = sqlSession.selectList("selectlist2","SALES");
			List<DeptTO> lists = sqlSession.selectList("selectlist3","S");
			
			System.out.println(lists.size());
			
			for(DeptTO to : lists) {
				System.out.println(to.getDeptno());
				System.out.println(to.getDname());
				System.out.println(to.getLoc());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		}finally {
			if(sqlSession != null)sqlSession.close();
			if(is != null)try {is.close();} catch(IOException e) {}
		}
	}

}
