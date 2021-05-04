package ex02;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "사과&참외&&수박&&딸기";
		
		StringTokenizer st = new StringTokenizer(data,"&");
		System.out.println(st.countTokens()); 		//4
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		String[] datas = data.split("&");
		System.out.println(datas.length);			//7
		
		for(String s : datas) {
			System.out.println(s);
		}
	}

}
