package com.hackbulgaria.corejava.generics2;

import java.util.ArrayList;
import java.util.List;

@ClassInfo(author = "Rosen", clazzes = { Integer.class, })
public class Main {
	public static List asList(Object... args) {// vru6tame spisak ot T

		List<Object> list = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			list.add(args[i]);
		}
		return list;

	}
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		ArrayList<Integer> ints = new ArrayList<>(asList(1, 2, 3));
		for (Integer integer : ints) {
			System.out.println(integer);
		}
		// ClassInfo clasInfo = Main.class.getAnnotation(ClassInfo.class);
		// System.out.println(clasInfo);
		// Box<Integer> box = new Box<Integer>();
		// box.set(3);
		// Box<String> boxString = new Box<String>("ala bala");
		// Pair<Integer, String> pair = new Pair<>();
		// pair.setFirst(123);
		// pair.setTow("alabalo");
		// System.out.println(pair.toString());
		// NewInstanseClazz3.newIstance(Pair.class);
//		Favourites fav = new Favourites();
//		fav.add2(Integer.class, 3);
//		fav.add2(String.class, "sth");
//		fav.add2(Integer.class, 4);
//		System.out.println(fav.get2(Integer.class).toString());
	}
}

