package ex02;

import java.text.DecimalFormat;
import java.text.ParseException;
public class DecimalFormatEx01 {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		//형식화된 문자열	-String.format()
		//숫자/날짜
		
		String strFormat = String.format("$%s,%s","10","000");
		System.out.println(strFormat);
		
		//숫자 -> 형식화된 문자열
		DecimalFormat df = new DecimalFormat("$#,###");
		double orgNum = 12345.0;
		System.out.println(df.format(orgNum));
		
		String strNum = "$1,2345.45";
		double parsedNum = (double)df.parse(strNum);
		System.out.println(parsedNum);
	}

}
