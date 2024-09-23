package com.Collections;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedList1 {
//LinkedList --doblylinked linked
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(0,22);
		l1.add(1);
		l1.add(1);
		l1.add(1);
		l1.addFirst(12);
		l1.addLast(45);
		//l1.addAll(1,l1);
		//l1.remove(1);
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		Iterator x=l1.descendingIterator();
//		while(x.hasNext())
//			System.out.println(x.next());
		System.out.println(l1.peek());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		
		AbstractSequentialList<Integer> a1 =new LinkedList<Integer>()
;
		a1.add(10);
		a1.add(9);
		a1.add(8);
		System.out.println(a1.get(0));
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(1);
		v.add(1);
		v.insertElementAt(20, 1);
		Stack<Integer> s12=new Stack<>();
		s12.push(9);
		s12.push(8);
		System.out.println(s12.peek());
		System.out.println(s12.isEmpty());
		System.out.println(s12.pop());
		
		
	}

}
