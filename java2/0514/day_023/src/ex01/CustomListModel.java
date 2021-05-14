package ex01;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<Object> {
	//String[] items = new String[] {"사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기"};
	ArrayList<String> items =null;
	public CustomListModel() {
		items = new ArrayList<String>();
		items.add("사과");
		items.add("참외");
		items.add("수박");
		items.add("딸기");
		
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}
	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return items.get(index);
	}

}
