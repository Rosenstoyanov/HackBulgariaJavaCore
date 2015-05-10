package com.hackbulgaria.SynhronizedThreads;

import java.util.ArrayList;

public class blockedQueue {
	ArrayList<Object> aL = new ArrayList<>();
	Thread pullThread;

	public void put(Object obj) {
		aL.add(obj);
	}

	public Object poll() {
		if (aL.size() == 0) {
			pollNewThread();
			return null;
		} else {
			return aL.get(aL.size());
		}

	}

	public void pollNewThread() {
		pullThread = new Thread() {
			@Override
			public void run() {
				while (aL.size() == 0) {
					try {
						pullThread.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				pullThread.notify();
				poll();
			}
		};

	}
}
