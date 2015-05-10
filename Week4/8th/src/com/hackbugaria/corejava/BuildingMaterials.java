package com.hackbugaria.corejava;

public enum BuildingMaterials {
	Wood(5), Iron(10), Ice(50), Glass(120);
	private double price;
	private final int moneyForMery = 25;

	BuildingMaterials(double p) {
		price = p;
	}

	public double getPrice(double amount) {
		return (amount * price + moneyForMery);
	}
}