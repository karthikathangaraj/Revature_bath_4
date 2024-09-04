package com.samples;

public class stringbuffer1 {

	public static void main(String[] args) {
		StringBuffer b1=new StringBuffer("karthika");
		b1.append(" thangaraj");
		System.out.println(b1);
		b1.insert(14, "jayanthi");
		b1.delete(14, 20);
		System.out.println(b1.reverse());
		StringBuilder s1=new StringBuilder("kkkk");
		

	}

}
