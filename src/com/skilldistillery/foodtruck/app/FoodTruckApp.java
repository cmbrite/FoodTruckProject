package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruck[] trucks = new FoodTruck[5];
		trucks[0] = new FoodTruck();
		trucks[1] = new FoodTruck();
		trucks[2] = new FoodTruck();
		trucks[3] = new FoodTruck();
		trucks[4] = new FoodTruck();

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the food truck name: ");
			String truckName = sc.nextLine();
			int nextTruckId = 0;
			nextTruckId = i + 1;
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Please enter the food type: ");
			String foodType = sc.nextLine();

			System.out.println("Please rate the food truck: ");
			double truckRating = sc.nextDouble();
			sc.nextLine();

			FoodTruck copyTrucks = new FoodTruck(nextTruckId, truckName, foodType, truckRating);
			trucks[i] = copyTrucks;
			System.out.println(copyTrucks);
			System.out.println();
		}

		System.out.println("Please select a number for the corresponding menu choice.");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		int choice = sc.nextInt();

		for (int i = 0; i < trucks.length; i++) {
			if (choice == 1) {
				System.out.println(trucks.toString());
			} else {
				System.out.println("Invalid menu choice");
				break;
			}
			
//		else if(choice == 2) {
//		double average = truckRating / numTrucks;
//		System.out.print(average);
//		}
//		else if(choice == 3) {
//		System.out.print(bestTruck);
//		}
//			else if(choice == 3) {
//				System.out.print(bestTruck);
//				}

			sc.close();
		}
	}
}
