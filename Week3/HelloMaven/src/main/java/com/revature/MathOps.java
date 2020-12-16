package com.revature;

public class MathOps {
	
	private String s = "Showing getters and setters";
	
	
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		//this prevents outside methods from ever setting s to an empty string. 
		if(s.equals("")) {}
		else {
		this.s = s;
		}
	}

	public int add( int i, int j) {
		return i+j;
	}
	
	public int subtract (int i, int j) {
		return i-j;
	}
	
	public int divide(int i, int j) {
		return i/j;
	}

}
