package model1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

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
