package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

class student12 implements Comparable<student12> 
{
	int sno;
	int phone;
	String name;
	
	public student12(int sno, int phone, String name) {
		super();
		this.sno = sno;
		this.phone = phone;
		this.name = name;
	}

	@Override
	public int compareTo(student12 o) {
		System.out.println("hi");
		if(sno==o.sno)
			return 0;
		else if(sno >o.sno)
			return 1;
		else
			return -1;
		
	}

	
	
}
public class student1{  
public static void main(String args[]){  
	
	
	ArrayList<student12> s1=new ArrayList<student12>();
	s1.add(new student12(1,121,"ka"));
	s1.add(new student12(2,121,"kar"));
	s1.add(new student12(12,121,"kavi"));
	s1.add(new student12(223,121,"kani"));
	Collections.sort(s1);
	for(student12 s: s1)
		System.out.println("name:"+ s.sno +" " +"sno: " + s.name);
	
}}

