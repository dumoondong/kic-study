package ex03;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("./value2.dat"));
			
			String[]names = {"홍길동", "박문수", "이몽룡"};
			int[]ages = {10,20,30};
			double[] weights = {71.4,67.9,58.5};
			
			for(int i=0; i<names.length; i++) {
				dos.writeUTF(names[i]);
				dos.writeInt(ages[i]);
				dos.writeDouble(weights[i]);
			}
			
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if(dos != null)try {dos.close();}catch(IOException e) {}
		}
	}

}
