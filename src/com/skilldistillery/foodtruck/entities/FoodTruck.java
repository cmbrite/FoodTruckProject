package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int nextTruckId;
	private String truckName;
	private String foodType;
	private int truckRating;

	public void input(String name, String foodType, int truckRating) {
		
		for (int i = 0; i < 5; i++) {
			
		System.out.println("Please enter the food truck name: ");
		this.truckName = name;
		if(!name.equalsIgnoreCase("quit")) {
		System.out.println("Please enter the food type: ");
		this.foodType = foodType;
		System.out.println("Please rate the food truck: ");
		this.truckRating = truckRating;
			}
			}
	}

	public FoodTruck(int nextTruckId) {
		super();
		this.nextTruckId = nextTruckId;
	}
}
