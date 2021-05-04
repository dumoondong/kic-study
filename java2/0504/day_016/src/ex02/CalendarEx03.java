package ex02;
import java.util.Calendar;
public class CalendarEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.add(Calendar.DATE, 1);
		System.out.println(c.getTime());
	}

}
