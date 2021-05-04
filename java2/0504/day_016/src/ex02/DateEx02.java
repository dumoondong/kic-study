package ex02;

import java.util.Date;

public class DateEx02 {
	public static void main(String[] args) {
		
		Date d1 = new Date();	// 현재 날짜/시간
		Date d2 = new Date(2021 - 1900, 5-1, 4);
		System.out.println(d2.toLocaleString());
		
		//2021년 12월 25일 요일...
		Date d3 = new Date(2021 - 1900, 12-1, 25);
		System.out.println(d3.getDay());
	}

}
