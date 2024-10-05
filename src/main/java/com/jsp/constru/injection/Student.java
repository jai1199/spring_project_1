package com.jsp.constru.injection;

public class Student 
{
 private String sname;
 private int sid;
 private int marks;
 private Department detp;
public Student(String sname, int sid, int marks) {
	super();
	this.sname = sname;
	this.sid = sid;
	this.marks = marks;
}
public Student(String sname, int sid, int marks, Department detp) {
	super();
	this.sname = sname;
	this.sid = sid;
	this.marks = marks;
	this.detp = detp;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", sid=" + sid + ", marks=" + marks + ", detp=" + detp + "]";
}
 
}
