package model1;

public class BoardTO {
	private String subject;
	private String writer;
	
	public String getSubject() {
		System.out.println("getSubject 호출");
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		System.out.println("getWriter 호출");
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
