package ex02;

public class WrapperEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형변환
		
		Integer i1 = Integer.valueOf(345);
		Integer i2 = Integer.valueOf("345");
		//authobox
		Integer i3= 345;
		
		System.out.println(i1);
		System.out.println(i2);
		
		byte b1 = i1.byteValue();
		float f1 = i1.floatValue();
		System.out.println(b1);
		System.out.println(f1);
		
		String str1 = i1.toString();
		String str2 = Integer.toString(123);
		String str3 = 123+ "";
		
		//진법 System.out.printf
		String str41 = Integer.toBinaryString(100);
		System.out.println(str41);
		
		int i11 = Integer.parseInt("123");
		float f11 = Float.parseFloat("123");
		System.out.println(i11 + 10);
		System.out.println(f11 + 10);
	}

}
