package ex02;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatEx01 {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		String source = "2021년 5 월 6일";
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date parsedDate = format.parse(source);
		System.out.println(parsedDate.toLocaleString());
		
		
		
	}

}
