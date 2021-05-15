package com.suhas.demo;

public class Student {
	private int sid;
	private String name;
	private String subject;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", subject=" + subject + "]";
	}
}
