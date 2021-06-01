package pack6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
			
		try {
			serverSocket = new ServerSocket( 7777 );
			while(true) {
				try {
					System.out.println( "출력 서버가 준비되었습니다." );
					socket = serverSocket.accept();
					System.out.println( "클라이언트와 연결되었습니다." );
					
					br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
					bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
	
					String msg = br.readLine();

					System.out.println("메시지 : "+msg);
					for(int i=Integer.parseInt(msg); i<=9;) {
						for(int j=1; j<=9; j++) {
							//System.out.println(i +"*"+j +"="+i*j);
							bw.write(i +"*"+j +"="+i*j +"\t");
							bw.flush();
						}
						break;
					}

					
					System.out.println("전송완료");
				}catch(IOException e) {
					System.out.println( "[에러] " + e.getMessage() );
				}finally {
					if( br != null) try { br.close(); } catch(IOException e) {}
					if( bw != null) try { bw.close(); } catch(IOException e) {}
					
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
