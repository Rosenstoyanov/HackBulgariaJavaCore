package com.hackbulgaria.SynhronizedThreads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		// long start = System.currentTimeMillis();
		// IncrementRunnable inc = new IncrementRunnable();
		// Thread t1 = new Thread(inc, "t");
		// Thread t2 = new Thread(inc);
		// t1.start();
		// t2.start();
		// t1.join();
		// t2.join();
		// inc.print();
		// // inc.increment();
		// long end = System.currentTimeMillis();
		// System.out.println(end - start);
		// System.out.println(t1.getName());
		// Integer in = new Integer(4);
		// int a = 4;
		blockedQueue bq = new blockedQueue();
		bq.put(1);
		Object a = bq.poll();
		Object b = bq.poll();
	}
}
