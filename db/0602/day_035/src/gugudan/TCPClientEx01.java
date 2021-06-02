package gugudan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			System.out.println( "서버와 연결 중 입니다." );
			socket = new Socket( "localhost", 7777 );
			System.out.println( "서버와 연결되었습니다." );
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			
			int startDan = Integer.parseInt(args[0]);
			int endDan = Integer.parseInt(args[1]);
			if(startDan == 0 || endDan  == 0) {
				bw.close();
			}
			bw.write(startDan + ":"+ endDan + "\n");
			bw.flush();
			
			String msg = br.readLine();
			String[] gugudans = msg.split(":");
			for(String gugudan : gugudans) {
				System.out.println(gugudan);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( bw != null) try { bw.close(); } catch(IOException e) {}
			if( br != null) try { br.close(); } catch(IOException e) {}
			
			if( socket != null) try { socket.close(); } catch(IOException e) {}
		}
	}

}
