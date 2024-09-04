package com.samples;

public class strings1 {

	public static void main(String[] args)
	{
		String s1="karthika,thangaraj,jayanthi";
		//s1="anitha";
		String s2=new String("Thangaraj");
		System.out.println(s2.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(4,6));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('a', 'e'));
		String a[]=s1.split(",");
		for(String i:a)
			System.out.print(i+" ");
		System.out.println(s1.contains("a"));
	}

}
