package com.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PQ {

	public static void main(String[] args) throws InterruptedException {
		
		 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		 pQueue.add(10);
		 pQueue.add(20);
	     pQueue.add(15);
	     System.out.println(pQueue);
	     BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
	        queue.put("StarWars");
	        queue.put("SuperMan");
	        queue.put("Flash");
	        queue.put("BatMan");
	        //queue.put("Avengers");
	        System.out.println("queue contains " + queue);
	        
	        Deque<Integer> deque = new ArrayDeque<>();
	        deque.addFirst(12);
	        deque.addLast(13);
	        deque.addLast(14);
	        deque.add(15);
	        deque.add(16);
	        System.out.println(deque);
	        deque.removeFirst();
	        System.out.println(deque);
	        
	        
	        
	        
	}

}
