package ex01;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
	private String[][] items = new String[][] {
		{"1", "2", "3", "4", "5"},
		{"6", "7", "8", "9", "10"},
		{null, null, null, null, null},
		{null, null, null, null, null},
		{null, null, null, null, null},
	};
	
	private String[] columnNames =new String[] {
			"\uCEEC\uB7FC1", "\uCEEC\uB7FC2", "\uCEEC\uB7FC3", "\uCEEC\uB7FC4", "\uCEEC\uB7FC5"
	};
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return items.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return items[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return items[rowIndex][columnIndex];
	}

}
