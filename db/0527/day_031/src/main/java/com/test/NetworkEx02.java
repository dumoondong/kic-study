package com.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress inetAddress = InetAddress.getByName("www.daum.net");
			
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
