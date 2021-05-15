package com.suhas.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {
	private int rollno;
	private String name;
	private String subject;
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Student() {
		super();
		System.out.println("Object created");
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + ", laptop=" + laptop + "]";
	}
	public void show() {
		System.out.println("Hello from student class");	
		laptop.compile();
	}
}
