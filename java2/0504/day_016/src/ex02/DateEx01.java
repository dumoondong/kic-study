package ex02;

import java.util.Date;
//ctrl shift o
public class DateEx01 {
	public static void main(String[] args) {
		//날짜/시간
		//Date/Calendar
		//java.util.Date d1 = new java.util.Date();
		Date d1 = new Date();
		//overiding
		System.out.println(d1.toString());
		//deprecated
		String strDate = d1.toLocaleString();
		System.out.println(d1.toLocaleString());
		
		System.out.println(strDate);
		System.out.println(strDate.substring(0,4));
		System.out.println(strDate.substring(6,8));
		
		System.out.println(d1.getYear() + 1900);
		System.out.println(d1.getMonth());
		System.out.println(d1.getDate());
		System.out.println(d1.getHours());
		//0:일요일
		String[] Day = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println(Day[d1.getDay()]);

		System.out.println(d1.getDay());
		if(d1.getDay() == 2) {
			System.out.println("화요일");
		}
		switch(d1.getDay()) {
		case 2:
			System.out.println("화요일");
			break;
		}
	}
}
