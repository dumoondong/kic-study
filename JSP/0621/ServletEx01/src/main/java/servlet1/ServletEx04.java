package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx04 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doProces(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doProces(req, resp);
	}
	protected void doProces(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		String data = req.getParameter("data");
		String data2 = req.getParameter("data2");
		
		
		resp.setContentType("text/html;charset=utf-8");
		
		StringBuilder sbHtml = new StringBuilder();
		sbHtml.append("<!DOCTYPE html");
		sbHtml.append("<html>");
		sbHtml.append("<head>");
		sbHtml.append("<meta charset=\"UTF-8\">");
		sbHtml.append("<title>Insert title here</title>");
		sbHtml.append("</head>");
		sbHtml.append("<body>");
		sbHtml.append("<table border='1' width='800'>");
		for(int i=Integer.parseInt(data); i<=Integer.parseInt(data2); i++) {
			sbHtml.append("<tr>");
			for(int j=1; j<=9; j++) {
				sbHtml.append("<td>" + i + " X " +j + " = " + (i*j) + "</td>");
			}
			sbHtml.append("</tr>");
		}
		sbHtml.append("</table>");
		sbHtml.append("</body>");
		sbHtml.append("</html>");
		

		PrintWriter out = resp.getWriter();
		out.println(sbHtml);
		out.close();
	}
}
