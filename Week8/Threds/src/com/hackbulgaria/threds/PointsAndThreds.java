package com.hackbulgaria.threds;

import java.awt.Point;
import java.util.List;
import java.util.Map;

public class PointsAndThreds implements Runnable {
	private final int from;
	private final int to;
	private final List<Point> listPoints;
	private final Map<Point, Point> result;
	// Collections.synchronizedMap(outMap);

	public PointsAndThreds(int otkude, int dokude, List<Point> listP,
			Map<Point, Point> maps) {
		this.from = otkude;
		this.to = dokude;
		this.listPoints = listP;
		// this.result = Collections.synchronizedMap(maps);
		this.result = maps;
	}

	// public Map<Point, Point> getNearestPoint(List<Point> pointsList) {
	// this.result = Collections.synchronizedMap(new HashMap<Point, Point>());
	//
	// Thread t1 = new Thread(this);
	// t1.start();
	//
	// doCalculations(pointsList, 0, 15_000, result);
	// try {
	// t1.join();
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// // doCalculations(pointsList, 15_000, 30_000, outMap);
	// return result;
	// }

	private static double getDistance(Point first, Point second) {
		return (first.x - second.x) * (first.x - second.x)
				+ (first.y - second.y) * (first.y - second.y);
	}

	public void doCalculations(List<Point> inPoints, int indexFrom,
			int indexTo, Map<Point, Point> outMap) {
		// Map<Point, Point> nearestPoints = new HashMap<>();
		// Collections.synchronizedMap(nearestPoints);
		for (int i = indexFrom; i < indexTo - 1; i++) {
			Point currentPoint = inPoints.get(i);
			Point nearestPoint = inPoints.get(i + 1);
			double distance = getDistance(currentPoint, nearestPoint);
			// System.out.println(i);
			for (int j = indexFrom; j < indexTo; j++) {
				if (currentPoint != inPoints.get(j)) {
					if (distance > getDistance(currentPoint, inPoints.get(j))) {
						distance = getDistance(currentPoint, inPoints.get(j));
						nearestPoint = inPoints.get(j);
					}
				}
			}
			outMap.put(currentPoint, nearestPoint);
		}
	}

	@Override
	public void run() {

		doCalculations(listPoints, from, to, result);
		System.out.println("running!!!");
	}
}
