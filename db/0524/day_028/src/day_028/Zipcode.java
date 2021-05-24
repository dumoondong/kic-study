package day_028;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Zipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String sentence = null;
			int count =1;
			while ((sentence = br.readLine() ) != null){
				String[] address = sentence.split(",");
				System.out.println(address[0]);
				
				String sql = String.format("insert into zipcode values ('%s','%s','%s','%s','%s','%s','%s')",address[0],address[1],address[2],address[3],address[4],address[5],address[6]);
				System.out.println(sql);
				count ++;
				if(count ==50 ) break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(br != null)try  {br.close();}catch(IOException e) {}
		}
	}

}
