package com.ibm.thread;

public class Worker extends Thread {///extend Thread
	@Override
	public void run() {
		System.out.println("In worker thread="+Thread.currentThread());
	}

}
