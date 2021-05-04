package ex02;
import java.util.StringTokenizer;
public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sprit
		
		String data = "사과 참외 수박 딸기";
		StringTokenizer st = new StringTokenizer(data);
		
		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String data2 = "사과&참외&수박&딸기";
		StringTokenizer st2 = new StringTokenizer(data2,"&");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
