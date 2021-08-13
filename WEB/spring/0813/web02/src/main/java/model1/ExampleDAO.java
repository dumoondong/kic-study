package model1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleDAO {
	@Autowired
	private DataSource dataSource;
	
	public String selectNow() {
		System.out.println("selectNow() 호출 :" + dataSource);
		return "now";
	}
}
