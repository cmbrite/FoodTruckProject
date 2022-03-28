package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int nextTruckId;
	private String truckName;
	private String foodType;
	private double truckRating;

//	The user is prompted to input the name, food type, and rating for up to five food trucks.

	public FoodTruck() {
	}

	public FoodTruck(int nextTruckId, String truckName, String foodType, double truckRating) {
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
		return "FoodTruck [nextTruckId=" + nextTruckId + ", truckName=" + truckName + ", foodType=" + foodType
				+ ", truckRating=" + truckRating + "]";
	}

	// TODO List all existing food trucks
	public void displayTrucks() {

		System.out.println();
	}

//TODO Average out the food trucks
	public void averageTruckRating() {

		System.out.println();
	}

//TODO Display truck with best average
	public void bestTruck() {

		System.out.println();
	}

}
