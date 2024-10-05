package com.jsp.constructorinjection;

public class Emp 
{
 private String ename;
 private int eid;
 private String branch;
public Emp(String ename, int eid, String branch) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.branch = branch;
}
@Override
public String toString() {
	return "Emp [ename=" + ename + ", eid=" + eid + ", branch=" + branch + "]";
}
 
}
