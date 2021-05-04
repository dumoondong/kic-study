package ex02;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		//일이 0이면 전달 마지막 날 ..
		c.set(2021, 5-1,3);
		System.out.println(c.getTime());
		
		Calendar c2 = Calendar.getInstance();
		
		long timeGap = c2.getTimeInMillis() - c.getTimeInMillis();
		System.out.println("TimeGap :"+timeGap);
	}

}
