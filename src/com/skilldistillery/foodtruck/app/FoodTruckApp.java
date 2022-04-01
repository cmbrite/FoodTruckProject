package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	FoodTruck[] trucks = new FoodTruck[5];

	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < trucks.length; i++) {
			System.out.println("Please enter the food truck name or type Quit to view menu. ");
			String truckName = sc.nextLine();
			int nextTruckId = 0;
			nextTruckId = i + 1;
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Please enter the food type: ");
			String foodType = sc.nextLine();

			System.out.println("Please rate the food truck 1-10: ");
			double truckRating = sc.nextDouble();
			sc.nextLine();

			FoodTruck copyTrucks = new FoodTruck(nextTruckId, truckName, foodType, truckRating);
			trucks[i] = copyTrucks;

//			System.out.println(trucks[i].toString());
//			System.out.println();

		}
		menu();
		int choice = sc.nextInt();

		if (choice == 1) {
			for (int i = 0; i < trucks.length; i++) {
				if (trucks[i] != null) {
					System.out.println(trucks[i]);
				}
			}
		} else if (choice == 2) {
//			trucks[i].getTruckRating();

//		else if(choice == 3) {
//		System.out.print(bestTruck);
		} else if (choice == 4) {
			System.out.print("GoodBye");
//			break;
		} else {
			System.out.println("Invalid menu choice");
//			break;
		}
		sc.close();
	}

	public void menu() {

		System.out.println("Please select a number for the corresponding menu choice.");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}
}
