package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class ObjectInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("./value1.dat"));
			
			String[] names = (String[])ois.readObject();
			int[] ages = (int[])ois.readObject();
			double[] weight = (double[])ois.readObject();
			
			System.out.println(Arrays.toString(names) );
			System.out.println(Arrays.toString(ages) );
			System.out.println(Arrays.toString(weight) );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(ois != null)try {ois.close();}catch(IOException e) {}
		}
	}

}
