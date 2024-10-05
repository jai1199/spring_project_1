package com.jsp.refrencetype;

public class Tom 
{
 private String tname;
 private int tage;
 private int tphno;
 private Bom bom;
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public int getTage() {
	return tage;
}
public void setTage(int tage) {
	this.tage = tage;
}
public int getTphno() {
	return tphno;
}
public void setTphno(int tphno) {
	this.tphno = tphno;
}
public Bom getBom() {
	return bom;
}
public void setBom(Bom bom) {
	this.bom = bom;
}
@Override
public String toString() {
	return "Tom [tname=" + tname + ", tage=" + tage + ", tphno=" + tphno + ", bom=" + bom + "]";
}
 
}
