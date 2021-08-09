package com.exam.ex02;

public class BoardTO {
	private int seq;
	private String subject;
	
	public BoardTO() {
		System.out.println("BoardTO() 호출");
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
