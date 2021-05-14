package ex01;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel2 extends AbstractTableModel {
	//ArrayList 2개를 사용해서 변경
	private ArrayList<ArrayList<String>> items;
	
	public CustomTableModel2() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<ArrayList<String>>();
		ArrayList<String> item1 = new ArrayList<String>();
		item1.add("1");
		item1.add("2");
		item1.add("3");
		item1.add("4");
		item1.add("5");
		ArrayList<String> item2 = new ArrayList<String>();
		item2.add("10");
		item2.add("20");
		item2.add("30");
		item2.add("40");
		item2.add("50");
		
		items.add(item1);
		items.add(item2);
	}
	
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
		return items.size();
	} 

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return items.get(0).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return items.get(rowIndex).get(columnIndex);
	}

}
