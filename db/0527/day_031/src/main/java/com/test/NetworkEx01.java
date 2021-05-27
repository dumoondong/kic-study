package com.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress inetAddress : inetAddresses) {
				System.out.println(inetAddress.getHostName());
				System.out.println(inetAddress.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
