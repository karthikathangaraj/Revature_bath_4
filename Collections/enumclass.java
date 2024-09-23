package com.Collections;

import java.util.EnumSet;

enum enu1
{
	code,
	run,
	implement,
	data,
	project
};
public class enumclass {
	
	public static void main(String[] args) {
       EnumSet<enu1> s1,s2,s3,s4;
       
       s1=EnumSet.of(enu1.code,enu1.project);
       s2=EnumSet.allOf(enu1.class);
       s3=EnumSet.range(enu1.run, enu1.project);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
}
}
