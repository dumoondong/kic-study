package ex02;
import java.util.Calendar;
public class CalendarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		//일요일 1
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getTime());
		System.out.println(c.getTimeInMillis());
		
		//2월 마지막날..
		System.out.println(c.getMaximum(Calendar.DATE));
		System.out.println(c.getMinimum(Calendar.DATE));
	}

}
