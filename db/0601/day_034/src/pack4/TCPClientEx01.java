package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		
		try {
			System.out.println( "서버와 연결 중 입니다." );
			socket = new Socket( "localhost", 7777 );
			System.out.println( "서버와 연결되었습니다." );
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( socket != null) try { socket.close(); } catch(IOException e) {}
		}
	}

}
