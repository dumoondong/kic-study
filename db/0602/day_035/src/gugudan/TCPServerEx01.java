package gugudan;

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
	
					//시작단:끝단
					String msg = br.readLine();
					String[] dans = msg.split(":");
					
					int startDan = Integer.parseInt(dans[0]);
					int endDan = Integer.parseInt(dans[1]);
					
					//구구단\t구구단:
					StringBuffer sbResult = new StringBuffer();

					for(int dan=startDan; dan<=endDan; dan++) {
						for(int col=1; col<=9; col++) {
							
							sbResult.append(dan +"X"+col +"="+dan*col+"\t");
						}
						sbResult.append(":");  
					}
					
					bw.write(sbResult.toString()+"\n");
					bw.flush();

					
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
