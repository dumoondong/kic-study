package model1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class View1Model implements ViewModel{

	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Vie12Model execute() 호출");
	}

	public void exeucte(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("View1Model execute() 호출");
	}

}
