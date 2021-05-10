package ex03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("./value.dat"));
			
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readFloat());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}finally {
			if(dis != null)try {dis.close();}catch(IOException e) {}
		}
	}

}
