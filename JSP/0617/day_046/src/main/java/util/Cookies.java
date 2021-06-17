package util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Cookies {
	private HashMap<String, Cookie> cookieMap;
	
	public Cookies(HttpServletRequest request) {
		// TODO Auto-generated constructor stub
		cookieMap = new HashMap<String,Cookie>();
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length ; i++) {
				cookieMap.put(cookies[i].getName(), cookies[i]);
			}
		}
	}
	
	public boolean exists(String name) {
		return cookieMap.get(name) != null;
	}
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	public String getValue(String name) throws UnsupportedEncodingException{
		Cookie cookie = cookieMap.get(name);
		if( cookie == null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(),"utf-8");
	}
	public static Cookie createCookie(String name, String value) throws UnsupportedEncodingException{
		Cookie cookie = new Cookie(name, URLEncoder.encode(value,"utf-8"));
		return cookie;
	}
}
