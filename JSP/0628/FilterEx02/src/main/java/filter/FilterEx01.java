package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*.jsp")
public class FilterEx01 implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("2 - 첫번째 init() 호출");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("2 - 첫번째 destroy() 호출");
	}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		//전처리 구간
		System.out.println("첫번째 전처리");
		arg2.doFilter(arg0, arg1);
		//후처리 구간
		System.out.println("첫번째 후처리");
	}

}
