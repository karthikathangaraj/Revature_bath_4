package com.samples;

import java.util.Scanner;

public class replace11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String rp = null;
		String info=sc.next();
		char o=sc.next().charAt(0);
		char n=sc.next().charAt(0);
		int lo=info.lastIndexOf(o);
		System.out.println(lo);
		if(lo != -1)
			 rp = info.substring(0,lo)
			 +n
			 +info.substring(lo+1);
		//karthik+r+" "
		
		System.out.println(rp);
	}

}
