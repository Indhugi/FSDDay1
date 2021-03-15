package com.ibm.com;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<String> queue=new PriorityQueue<String>();
	queue.add("Block1");
	queue.add("Block2");
	System.out.println(queue.size());
	System.out.println(queue);
	//queue.remove();
	//System.out.println(queue);
	System.out.println(queue.toArray());
	System.out.println(queue);
}
}
