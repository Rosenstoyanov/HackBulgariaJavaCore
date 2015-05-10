package com.hackbulgaria.corejava.generics2;

public class NewInstanseClazz3 {
	public static <T> T newIstance(Class<T> clazz)
			throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}
}
