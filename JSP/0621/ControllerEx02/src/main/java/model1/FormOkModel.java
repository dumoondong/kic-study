package model1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormOkModel implements FormModel {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String data = request.getParameter("data");
		
		System.out.println("data :" + data);
		System.out.println("execute(HttpServletRequest request, HttpServletResponse response)  실행");
	}

}
