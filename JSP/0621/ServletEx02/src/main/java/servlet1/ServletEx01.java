package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet01","/servlet02"})
public class ServletEx01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html;charset=utf-8");
		
		StringBuilder sbHtml = new StringBuilder();
		sbHtml.append("<!DOCTYPE html");
		sbHtml.append("<html>");
		sbHtml.append("<head>");
		sbHtml.append("<meta charset=\"UTF-8\">");
		sbHtml.append("<title>Insert title here</title>");
		sbHtml.append("</head>");
		sbHtml.append("<body>");
		sbHtml.append("Hello doProcess <br />");
		sbHtml.append("</body>");
		sbHtml.append("</html>");
		

		PrintWriter out = resp.getWriter();
		out.println(sbHtml);
		out.close();
	}
	
}
