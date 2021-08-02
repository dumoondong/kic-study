import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisEx04 {

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
			
			Map map = sqlSession.selectOne("select5");
			Set<String> keys = map.keySet();
			for(String key : keys) {
				//컬럼명
				System.out.println(map.get(key));
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
