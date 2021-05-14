package ex01;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel1 extends DefaultComboBoxModel<Object> {
	private String[] items = {"사과","참외","수박","딸기"};
	
	
	//combobox에서 자동으로 호출 되는 메서드
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		System.out.println("getSize() 호출");
		return items.length;
	}
	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		System.out.println("getElementAt() 호출");
		return items[index];
	}
}
