<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.InputStream" %>

<%@ page import = "java.util.ArrayList" %>

<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>

<%@ page import="model1.DeptTO"%>
<%
	String resource = "myBatisConfig.xml";

	InputStream is = null;
	
	SqlSession sqlSession = null;
	
	StringBuilder sbHtml = new StringBuilder();
	try{
		is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory
			= new SqlSessionFactoryBuilder().build(is);
		System.out.println("설정 호출 성공");
		
		sqlSession = sqlSessionFactory.openSession(true);
		System.out.println("연결 성공");
		
		ArrayList<DeptTO> lists =(ArrayList)sqlSession.selectList("selectlist1");
		
		//System.out.println("[결과] : " + lists.size());
		sbHtml.append("<table>");
		for(DeptTO to : lists){
			sbHtml.append("<tr>");
			sbHtml.append("<td>"+to.getDeptno()+ "</td>");
			sbHtml.append("<td>"+to.getDname()+ "</td>");
			sbHtml.append("<td>"+to.getLoc()+ "</td>");
			sbHtml.append("</tr>");
		}
		sbHtml.append("</table>");
	}catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("[에러] : " + e.getMessage());
	}finally {
		if(sqlSession != null)sqlSession.close();
		if(is != null)is.close();
	}
%>
<%=sbHtml %>