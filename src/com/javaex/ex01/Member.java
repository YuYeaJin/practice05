package com.javaex.ex01;

public class Member {


	private String name;
	private String id;
	private int point;
	
	public String getName() {
		return name; 
	}
	
	public String getId() {
		return id; 
	}
	
	public int getPoint() {
		return point;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
	System.out.println("회원정보: " + name + "(" + id + ")" + ", " + point + "점");
	}
}
