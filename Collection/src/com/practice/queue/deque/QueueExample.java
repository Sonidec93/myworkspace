package com.practice.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {


	public static void main(String arg[]){

		Queue<String> q=new PriorityQueue<String>();
		System.out.println("---Adding elements to the priority queue---for using userdefined objects the object class must implement Comparable Interface");
		q.add("mukul");
		q.offer("sukhman");
		q.offer("mallll");
		Iterator<String> itr=q.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("---retreiving head of the queue-----");
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println("---Going to remove elements from queue--");
		
		
		q.poll();
		System.out.println(q);
		
		
		System.out.println("------Deque----we can add or remove elements from both ends and it is faster than LinkedList and Stack ");
		
		Deque<String> d=new ArrayDeque<String>();
		
		System.out.println("---Ading elements to Deque--- ");
		
		d.offer("mahesh");
		d.offer("sunita");
		d.offer("parineeti");
		
		System.out.println("Deque:"+d);
		d.pollLast();
		System.out.println("removing element from last :"+d);
		d.offerFirst("manu");
		System.out.println("Adding element in the front :"+d);
		
	}
}
