package ex01;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel3 extends AbstractTableModel {
	//ArrayList 1개+클래스를 사용해서 변경
	private ArrayList<Data> items;
	
	public CustomTableModel3() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<Data>();
		
		Data data1 = new Data("1", "2", "3", "4", "5");
		Data data2 = new Data("10", "20", "30", "40", "50");
		
		items.add(data1);
		items.add(data2);
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
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
		String result = "";
		Data data = items.get(rowIndex);
		switch(columnIndex) {
			case 0:
				result = data.getNum1();
				break;
			case 1:
				result = data.getNum2();
				break;
			case 2:
				result = data.getNum3();
				break;
			case 3:
				result = data.getNum4();
				break;
			case 4:
				result = data.getNum5();
				break;
		}
		return result;
	}

}
