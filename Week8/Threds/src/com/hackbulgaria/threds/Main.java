package com.hackbulgaria.threds;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
	private final static int POINTS_NUMBER = 80_000;
	private final static int POINTS_RANGING = 10_000;

	public static List<Point> generataPoints() {
		List<Point> list = new ArrayList<>();
		for (int i = 0; i < POINTS_NUMBER; i++) {
			list.add(randomPoint(POINTS_RANGING));
		}
		return list;
	}

	private static Point randomPoint(int range) {
		Random rand = new Random();
		int x = rand.nextInt((range - 0) + 1) + 0;
		int y = rand.nextInt((range - 0) + 1) + 0;
		Point point = new Point(x, y);
		return point;
	}

	public static void main(String[] args) throws InterruptedException {
		long timeStart = System.currentTimeMillis();
		List<Point> pointsList = generataPoints();
		// PointsAndThreds runnable = new PointsAndThreds();
		// Map<Point, Point> nearestPointsMap = runnable
		// .getNearestPoint(pointsList);
		Map<Point, Point> maps = Collections
				.synchronizedMap(new HashMap<Point, Point>());
		// Collections.synchronizedMap(maps);
		PointsAndThreds p1 = new PointsAndThreds(0, 40_000, pointsList, maps);
		PointsAndThreds p2 = new PointsAndThreds(40_000, 80_000, pointsList,
				maps);
		// PointsAndThreds p3 = new PointsAndThreds(30_000, 60_000, pointsList,
		// maps);
		// PointsAndThreds p4 = new PointsAndThreds(60_000, 80_000, pointsList,
		// maps);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		// Thread t3 = new Thread(p3);
		// Thread t4 = new Thread(p4);

		t1.start();
		t2.start();
		// t3.start();
		// t4.start();

		t1.join();
		t2.join();
		// t3.join();
		// t4.join();

		long timeEnd = System.currentTimeMillis();
		System.out.println("tyk: " + (timeEnd - timeStart));

	}
}
