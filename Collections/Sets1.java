package com.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets1 {

	public static void main(String[] args) {
//		Set<Integer> s1=new HashSet<>();
//		s1.add(1);
//		s1.add(10);
//		s1.add(13);
//		s1.add(31);
//		s1.add(51);
//		System.out.println(s1); 
//		Set<Integer> s2=new HashSet<>(); 
//		s2.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));
//		Set<Integer> u=new HashSet<>(s1); 
//		Set<Integer> inter=new HashSet<>(s1); 
//		u.addAll(s2);
//		inter.retainAll(s2);
//		System.out.println(s2); 
//		System.out.println(u);
//		System.out.println(inter);
//		
		
		SortedSet<Integer> ts
        = new TreeSet<Integer>();
		ts.add(99);
		ts.add(9);
		ts.add(98);
		ts.add(1);
		ts.add(2);
		System.out.println(ts);
		
		NavigableSet<Integer> ns = new TreeSet<>();
		 ns.add(0);
	        ns.add(1);
	        ns.add(2);
	        ns.add(3);
	        ns.add(4);
	        ns.add(5);
	        ns.add(6);
	        NavigableSet<Integer> reverseNs = ns.descendingSet();
	        System.out.println(reverseNs);
	        System.out.println(ns);
	}

}
