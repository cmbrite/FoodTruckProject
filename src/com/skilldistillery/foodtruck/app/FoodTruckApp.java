package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	public static void main(String[] args) {
	}

	private int numTrucks; // Total number of trucks
	private FoodTruck[] trucks; // Array of created food trucks
	private final int MAX_TRUCKS = 5; // Max number of trucks

	public FoodTruckApp() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}

	public void addTruck(FoodTruck t) {
		trucks[numTrucks] = t;
		numTrucks++; // increment the number of trucks up to MAX_Trucks
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] truckCopy = new FoodTruck[trucks.length];
		for (int i = 0; i < trucks.length; i++) {
			truckCopy[i] = trucks[i];
		}
		return truckCopy;
	}
	//TODO Make menu method?
//		System.out.println("Please select a number for the corresponding menu choice.");
//		System.out.println("1. List all existing food trucks.");
//		System.out.println("2. See the average rating of food trucks.");
//		System.out.println("3. Display the highest-rated food truck.");
//		System.out.println("4. Quit the program.");
//		
	public void runApp() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int truckId = i + 1;

//		TODO figure out how to make program quit

			System.out.println("Please enter the food truck name: ");
			String truckName = sc.nextLine();

			if (!truckName.equalsIgnoreCase("quit")) {
				break;
			}
				System.out.println("Please enter the food type: ");
				String foodType = sc.nextLine();

				System.out.println("Please rate the food truck: ");
				double truckRating = sc.nextDouble();
		}
	}
}
