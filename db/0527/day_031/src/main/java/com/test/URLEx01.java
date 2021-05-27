package com.test;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://search.naver.com:8080/dir1/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=covid");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
