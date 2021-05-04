package ex02;
import java.util.Date;
public class DateEx03 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());	//timestamp
		
//		Date d2 = new Date();
//		Date d2 = new Date(System.currentTimeMillis());
//		System.out.println(d2.toLocaleString());
		Date d2 = new Date(2021 -1900, 5-1,3);
		long timeGap = d1.getTime() - d2.getTime();
		System.out.println("시간차 :"+timeGap/1000/60/60);
	}
}
