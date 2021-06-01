package pack3;

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
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket( 7777 );
			System.out.println( "출력 서버가 준비되었습니다." );
			socket = serverSocket.accept();
			System.out.println( "클라이언트와 연결되었습니다." );
			br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream() ) );
			
			// 전송된 데이터 읽기
			String msg = br.readLine();
			System.out.println("클라이언트에서 보낸 메시지 :"+msg);
			
			bw.write( "Hello Client" + "\n" );
			bw.flush();
			
			System.out.println( "전송 완료" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null) try { br.close(); } catch(IOException e) {}
			if( bw != null) try { bw.close(); } catch(IOException e) {}
			
			if( socket != null) try { socket.close(); } catch(IOException e) {}
			if( serverSocket != null) try { serverSocket.close(); } catch(IOException e) {}
		}
	}

}
