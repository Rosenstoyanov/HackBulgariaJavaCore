package com.hackbulgaria.corejava.generics2;

import java.util.HashMap;

public class Favourites {
	// private final HashMap<String, String> map = new HashMap<>();

	// public <T> void add(Class<T> clazz, Object obj) {
	// map.put(clazz.toString(), obj.toString());
	// }
	//
	// public <T> String get(Class<T> clazz) {
	// return map.get(clazz.toString());
	// }

	private final HashMap<Class<?>, Object> map2 = new HashMap<>();
	public <T> void add2(Class<T> clazz, Object obj) {
		map2.put(clazz, obj);
	}

	public <T> Object get2(Class<T> clazz) {
		return map2.get(clazz);
	}
}
