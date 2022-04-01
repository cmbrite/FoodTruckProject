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
//				continue;
				sc.nextLine();
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
			//Menu1 method prints all create Food Trucks
			menu1();
			
			// Menu2 prints average of all created Food Trucks
		} else if (choice == 2) {
			menu2();
		}
		// TODO menu3 doesn't work
		else if(choice == 3) {
		menu3();
		}
		else if (choice == 4) {
			System.out.print("GoodBye");
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
	public void menu2() {
		double totalRating = 0;
		int num = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] == null) {
				break;
			}
			totalRating += trucks[i].getTruckRating();
			num = (i + 1);
		}
		double averageRating = totalRating / num;
		System.out.println("The average rating of your " + num + " food trucks is " + averageRating);
	}

	public void menu3() {
		FoodTruck highestRated = trucks[0];
		for(int i = 0; i < trucks.length; i++) {
			if(trucks[i] == null) {
				continue;
			}
			if(trucks[i].getTruckRating() > highestRated.getTruckRating()) {
				highestRated = trucks[i];
			}
		}System.out.println("The hightest rated food truck is " + highestRated);
	}

}
