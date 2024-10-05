package com.jsp.refrencetype;

public class Bom 
{
  private String name;
  private int age;
  private int ph_no;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPh_no() {
	return ph_no;
}
public void setPh_no(int ph_no) {
	this.ph_no = ph_no;
}
@Override
public String toString() {
	return "Bom [name=" + name + ", age=" + age + ", ph_no=" + ph_no + "]";
}
  
}
