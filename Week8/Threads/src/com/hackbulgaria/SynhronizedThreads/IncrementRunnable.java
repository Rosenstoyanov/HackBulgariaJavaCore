package com.hackbulgaria.SynhronizedThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementRunnable implements Runnable {
	public static int counter = 0;
	private final AtomicInteger atomicCount = new AtomicInteger();
	private final Object monitor = new Object();

	public void increment() {
		// synchronized (monitor) {
			// monitor.wait();
		for (int i = 0; i < 2_000_000; i++) {
			// IncrementRunnable.counter++;
			atomicCount.getAndIncrement();
			}

		// }
	}

	public void print() {
		// System.out.println(counter);
		System.out.println(atomicCount);
	}

	@Override
	public void run() {
		increment();

	}
}
