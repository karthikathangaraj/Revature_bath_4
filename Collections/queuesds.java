package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class queuesds {
	
	public static void main(String[] args) {
		Queue<Integer> q1 =new LinkedList<>();
		//Queue<Integer> q2 =new ArrayList();
		q1.add(1);// 5 
		q1.offer(2);// 6 false 
		q1.add(9);
		q1.add(8);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}

}
