package com.jsp.constru.injection;

public class Department 
{
  private String dname;
  private int dno;
public Department(String dname, int dno) {
	super();
	this.dname = dname;
	this.dno = dno;
}
@Override
public String toString() {
	return "Department [dname=" + dname + ", dno=" + dno + "]";
}
 
}
