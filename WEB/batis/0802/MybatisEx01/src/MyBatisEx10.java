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

public class MyBatisEx10 {

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
			
			br = new BufferedReader(new FileReader("./zipcode_all_utf8_type2.csv"));
			
			String sentence = null;
			int count = 1;
			while((sentence = br.readLine()) != null) {
				String[] address = sentence.split(",");
				
				ZipcodeTO to = new ZipcodeTO();
				to.setZipcode(address[0]);
				to.setSido(address[1]);
				to.setGugun(address[2]);
				to.setDong(address[3]);
				to.setRi(address[4]);
				to.setBunji(address[5]);
				to.setSeq(address[6]);
				
				count += sqlSession.insert("insertzipcode",to);
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
