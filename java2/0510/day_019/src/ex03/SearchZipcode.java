package ex03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchZipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String data = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("입력하시오 : ");
			String sido = sc.next();	
			if(sido.length()<=1 ) {
				System.out.print("다시입력하시오 : ");
				sido = sc.next();	
			}
			while((data=br.readLine())!= null) {	
				String[] sido1 = data.split(",");
				if(sido1[3].startsWith(sido)) {
					System.out.println(data);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(br != null) try { br.close();} catch(IOException e) {}
		}
	}

}
