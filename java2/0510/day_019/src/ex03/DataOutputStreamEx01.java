package ex03;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("./value.dat"));
			
			dos.writeInt(2020);
			dos.writeUTF("utf-8 형식으로 저장");
			dos.writeFloat(1.8f);
			
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
