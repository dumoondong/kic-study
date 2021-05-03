package ex02;

public class WrapperEx03 {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		//auto boxing
		Integer i2 = 20;
		
		//auto unboxing
		int i11= i1;
		int i12= i2;
		
		int sum = i1+i2;
		System.out.println(sum);
	}
}
