package ex02;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class ZipCode extends AbstractTableModel {
	private ArrayList<Data> items;
	public ZipCode() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<Data>();
		String num = "";
		String zipnum = "";
		String sido = "";
		String gu = "";
		String dong = "";
		String re = "";
		String bun = "";
		
		Data data1 = new Data(num,zipnum,sido,gu,dong,re,bun);
		
		items.add(data1);
	}
	private String[] columnNames =new String[] {
			"\uBC88\uD638", "\uC6B0\uD3B8\uBC88\uD638", "\uC2DC\uB3C4", "\uAD6C\uAD70", "\uB3D9", "\uB9AC", "\uBC88\uC9C0"
	};
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
			case 5:
				result = data.getNum6();
				break;
			case 6:
				result = data.getNum7();
				break;
		}
		return result;
	}

}
