package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	//Food Truck Fields
	private int nextTruckId;
	private String truckName;
	private String foodType;
	private double truckRating;

	//No args Constructor
	public FoodTruck() {
	}
	//Constructor
	public FoodTruck(int nextTruckId, String truckName, String foodType, double truckRating) {
		super();
		this.nextTruckId = nextTruckId;
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
	}

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

//	Generated toString
	@Override
	public String toString() {
		return "FoodTruck Truck ID: " + nextTruckId + ", Truck Name: " + truckName + ", Food Type: " + foodType
				+ ", Rating: " + truckRating;
	}


}
