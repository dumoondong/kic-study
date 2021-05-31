package jsoup;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
	private ArrayList<NewsTO> newsLists;
	private String[] columnNames = new String[] {
		"\uCD9C\uCC98", "\uC81C\uBAA9", "\uB0B4\uC6A9"
	};
	
	public CustomTableModel() {
		// TODO Auto-generated constructor stub
		NewsDAO02 dao = new NewsDAO02();
		this.newsLists = dao.newsLists();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return newsLists.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		NewsTO to = newsLists.get(rowIndex);
		String result = "";
		switch( columnIndex ) {
		case 0:
			result = to.getSource();
			break;
		case 1:
			result = to.getSubject();
			break;
		case 2:
			result = to.getContent();
			break;
		}
		
		return result;
	}

}
