package ex03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("./value2.dat"));
			//순서가 중요
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
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
