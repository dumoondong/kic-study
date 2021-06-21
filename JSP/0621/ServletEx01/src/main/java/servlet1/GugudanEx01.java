package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GugudanEx01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding( "utf-8" );
			
		String startdan = req.getParameter("startdan") == null ? "" : req.getParameter("startdan");
		String enddan = req.getParameter("enddan") == null ? "" : req.getParameter("enddan");
			
		resp.setContentType( "text/html;charset=utf-8" );
			
		StringBuilder sbHtml = new StringBuilder();
		sbHtml.append( "<!DOCTYPE html>" );
		sbHtml.append( "<html>" );
		sbHtml.append( "<head>" );
		sbHtml.append( "<meta charset='utf-8'>" );
		sbHtml.append( "<title></title>" );
		sbHtml.append( "</head>" );
		sbHtml.append( "<body>" );
		sbHtml.append( "<form action='./gugudan01' method='post'>" );
		sbHtml.append( "시작단 : <input type='text' name='startdan' />" );
		sbHtml.append( " - " );
		sbHtml.append( "끝단 : <input type='text' name='enddan' />" );
		sbHtml.append( "&nbsp;&nbsp;<input type='submit' value='구구단 출력' />" );
		sbHtml.append( "</form>" );
		sbHtml.append( "<br /><hr /><br />" );

		if( !startdan.equals( "" ) && !enddan.equals( "" ) ) {
		 
			int iStartdan = Integer.parseInt( startdan );
			int iEnddan = Integer.parseInt( enddan );
	
			sbHtml.append( "<table border='1' width='800'>" );
			for( int i=iStartdan ; i<=iEnddan ; i++ ) {
				sbHtml.append( "<tr>" );
				for( int j=1 ; j<=9 ; j++ ) {
					sbHtml.append( "<td>" + i + " X " + j + " = " + ( i*j )+ "</td>" );
				}
				sbHtml.append( "</tr>" );
			}
			sbHtml.append( "</table>" );
		}
			
		sbHtml.append( "</body>" );
		sbHtml.append( "</html>" );
		
		PrintWriter out = resp.getWriter();
		out.println( sbHtml );
		out.close();
	}
}
