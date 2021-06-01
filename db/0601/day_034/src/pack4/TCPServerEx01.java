package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		Socket socket = null;
			
		try {
			serverSocket = new ServerSocket( 7777 );
			while(true) {
				try {
					System.out.println( "출력 서버가 준비되었습니다." );
					socket = serverSocket.accept();
					System.out.println( "클라이언트와 연결되었습니다." );
				}catch(IOException e) {
					System.out.println( "[에러] " + e.getMessage() );
				}finally {
					if( socket != null) try { socket.close(); } catch(IOException e) {}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( serverSocket != null) try { serverSocket.close(); } catch(IOException e) {}
		}
	}

}
