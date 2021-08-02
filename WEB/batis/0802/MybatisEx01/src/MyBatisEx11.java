import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "myBatisConfig.xml";
		
		InputStream is = null;
		SqlSession sqlSession = null;
		BufferedReader br = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			System.out.println("설정이 성공적으로 호출됨");
			
			//autocommit
			sqlSession = sqlSessionFactory.openSession(true);
			System.out.println("데이터베이스와 연결됨");
			
			List<ZipcodeTO> lists = sqlSession.selectList("selectzipcode","강남");
			
			System.out.println(lists.size());
			
			for(ZipcodeTO to : lists) {
				System.out.println(to.getZipcode());
				System.out.println(to.getSido());
				System.out.println(to.getGugun());
				System.out.println(to.getDong());
				System.out.println(to.getRi());
				System.out.println(to.getBunji());
				System.out.println(to.getSeq());
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
