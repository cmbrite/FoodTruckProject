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
			while (truckRating > 10 || truckRating < 1) {
				System.out.println("Invalid rating. Please select a number between 1-10");
				truckRating = sc.nextInt();
				continue;
			}
			trucks[i] = new FoodTruck(nextTruckId, truckName, foodType, truckRating);

			// System outs to test inputs
//			System.out.println(trucks[i].toString());
//			System.out.println();

		}
		// Calling menu method
		menu();
		// Input for menu choice
		int choice = sc.nextInt();
		while (choice > 4 || choice < 1) {
			System.out.println("Invalid menu choice. Please select a number between 1-4");
			choice = sc.nextInt();
			continue;
		}
		if (choice == 1) {
			menu1();
			// TODO menu2 doesn't work
		}
//		else if (choice == 2) {
//			menu2();
		// TODO menu3 doesn't work
//		else if(choice == 3) {
//		System.out.print(bestTruck);
//		}
		else if (choice == 4) {
			System.out.print("GoodBye");
//			break;
		}
		// Close scanner
		sc.close();
	}

	public void menu() {
//Menu options after inputs.
		System.out.println("Please select a number for the corresponding menu choice.");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}

	public void menu1() {
		{
			for (int i = 0; i < trucks.length; i++) {
				if (trucks[i] != null) {
					System.out.println(trucks[i]);
				}
			}
		}
	}

//	public void menu2(FoodTruck [] trucks) {
//		double average;
//		for (int i = 0; i < trucks.length; i++) {
//			if (trucks[i] != null) {
//				break;
//			}
//			System.out.println(trucks[i].getTruckRating());
//			double truckRating = trucks[i].getTruckRating();
//			average = truckRating / (i + 1);
////			System.out.println(average);
//		}
//	}
	public double menu2(FoodTruck [] trucks, int num) {
		double total = 0;
		for(int i = 0; i < trucks.length; i++ ) {
			if (trucks[i] == null) {
				break;
			}
			total += trucks[i].getTruckRating();
			num = i;
		}
		double averageRating = (Math.round(total/num)*10.0)/10.0;
		return averageRating;
	}

}
