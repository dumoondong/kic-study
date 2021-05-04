package ex03;

import java.util.Date;

public class TypeCastingEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent ->여러개 배열
		Parent[] arr1 = new Parent[3];
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		String str = new String("test");
		arr1[0] = p1;
		arr1[1] = p2;
		//arr1[2] = str;
		
		Object[] arr2 = new Object[3];
		arr2[0] = p1;
		arr2[1] = str;
		arr2[2] = new Date();
		
	}

}
