package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br =null;
		
		try {
			//다국어 이외의 문서
			URL url = new URL("https://m.naver.com");
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
		}
		
	}

}
