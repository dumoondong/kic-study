package model1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ViewModel {
	public void execute();
	public void exeucte(HttpServletRequest request,HttpServletResponse response);
}
