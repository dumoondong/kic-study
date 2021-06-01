package pack3;

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
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			System.out.println( "서버와 연결 중 입니다." );
			socket = new Socket( "localhost", 7777 );
			System.out.println( "서버와 연결되었습니다." );
			
			bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream() ) );
			br = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			
			bw.write("Hello Server" + "\n");
			bw.flush();
			System.out.println("전송 완료");
			
			System.out.println( "서버에서 보낸 메시지 : " + br.readLine() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null) try { br.close(); } catch(IOException e) {}
			if( bw != null) try { bw.close(); } catch(IOException e) {}
			
			if( socket != null) try { socket.close(); } catch(IOException e) {}
		}
	}

}
