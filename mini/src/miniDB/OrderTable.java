package miniDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class OrderTable extends AbstractTableModel{
private ArrayList<ArrayList<String>> datas;
	
	private String[] columnNames = new String[] {
			"\uBA54\uC778", "가격", "\uC0AC\uC774\uB4DC", "가격", "\uCD1D\uC561"
		};
	public OrderTable(String strId){
		String url = "jdbc:mysql://localhost:3306/project";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		this.datas = new ArrayList();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT id,main,mainprice,side,sideprice from orderquery where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			int sum = 0;
			while(rs.next()) {
				ArrayList<String> data = new ArrayList();
					data.add( rs.getString("main") );
					data.add( rs.getString("mainprice") );
					data.add( rs.getString("side") );
					data.add( rs.getString("sideprice") );
//					sum += Integer.parseInt(rs.getString("maintotalprice"));
//					sum += Integer.parseInt(rs.getString("sidetotalprice"));
//					data.add(Integer.toString(sum));
					
					datas.add(data);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
		}
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datas.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return datas.get(0).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return datas.get(rowIndex).get(columnIndex);
	}
}
