package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int nextTruckId;
	private String truckName;
	private String foodType;
	private double truckRating;

//	The user is prompted to input the name, food type, and rating for up to five food trucks.
	
	public FoodTruck(int nextTruckId, String truckName, String foodType, double truckRating) {
		this.nextTruckId = nextTruckId;	
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		}
//	TODO figure out how to make program quit
//	if(!name.equalsIgnoreCase("quit")) {
//		for (int i = 0; i < 5; i++) {
//		System.out.println("Please enter the food truck name: ");
//		System.out.println("Please enter the food type: ");
//		System.out.println("Please rate the food truck: ");
//			}

//	Generated getters and setters
	public int getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(int nextTruckId) {
		this.nextTruckId = nextTruckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}

//	Generated toString and removed nextTruckId
	@Override
	public String toString() {
		return "FoodTruck [Truck Name=" + truckName + ", Food Type=" + foodType
				+ ", Rating=" + truckRating + "]";
	}
	
	}


