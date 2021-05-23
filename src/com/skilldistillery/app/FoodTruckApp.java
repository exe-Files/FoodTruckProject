package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String input = ""; //TODO change this to a stringBuilder to save memory
		
		int numOfReviews = 5; //may be able to move to a separate class
		FoodTruck[] trucks = new FoodTruck[numOfReviews]; //array of 5 FoodTrucks objects created called trucks
		
		//reviewTrucks(numeOfReviews); 
		for (int i = 0; i < numOfReviews; i++) {
				System.out.println("*** Food truck " + (i+1) + " - Please input the name, food type, and your rating: ***");
				System.out.println("Name: ");
				input = scanner.nextLine(); //TODO turn this into a method for input validation
				if(input.equalsIgnoreCase("Quit") || input.equalsIgnoreCase("Q")) { //checks to see if user input 'quit'
					break; //moves to menu part of program
				}else {
					trucks[i] = new FoodTruck(); //initialize an instance of FoodTruck in the array 
					trucks[i].setName(input); //inputs name from earlier
					System.out.println("What kind of food does " + trucks[i].getName() +" serve?: ");
					String foodType = scanner.nextLine(); //next line causing issues, next instead
					trucks[i].setFoodType(foodType);
					System.out.print("Your rating (1 - 5): ");
					while(true) {
						int rating = Integer.parseInt(scanner.nextLine());
						if(rating > 0 && rating < 6) {
							trucks[i].setRating(rating);
							break;
						} else {
							System.out.println("Invalid rating, please enter a valid number between 1 - 5");
						}
					}
				}
				
			}
		
		


		
	//TODO displayMenu method
	
	//public void displayMenu() {
		int userChoice = 0;
		while(userChoice != 4) {
			System.out.println();
			System.out.println("************************************");
			System.out.println("|1.) List all existing food trucks |");
			System.out.println("|2.) Average rating of food trucks |");
			System.out.println("|3.) Highest rated food trucks 	   |");
			System.out.println("|4.) Quit                          |");
			System.out.println("************************************");
			System.out.print("\nPlease enter a selection: ");
			userChoice = scanner.nextInt();
			switch(userChoice){
			case 1:
				
				for (int i = 0; i < trucks.length; i++) {
					if (trucks[i] != null) {
						System.out.println(trucks[i].getName());
					}
				}
				break;
				
			case 2:
				//trucks.averageRatingFoodTrucks();
				int sumOfRatings = 0;
				double divCounter = 0;
				for (int i = 0; i < trucks.length; i++) {
					if (trucks[i] != null) {
						sumOfRatings += trucks[i].getRating();
						divCounter++;
					}
				}
				double averageRating =  (double)(sumOfRatings / divCounter);
				System.out.println(averageRating);
				
				break;
				
			case 3:
				//trucks.highestRated(); 
				int highestRating = trucks[0].rating;
				String highestRatedName = trucks[0].name;
				for (int i = 0; i < trucks.length; i++) {
					if (trucks[i] != null) {
						if (trucks[i].rating > highestRating) {
							highestRating = trucks[i].rating;
							highestRatedName = trucks[i].name;
							
						}
					}
				}
				System.out.println("The highest rated truck is " + highestRatedName + " with a score of " + highestRating + "!");
				break;
				
			case 4:
				System.out.println("Thank you, Come Again!");
				break;
			default:
				System.out.println("Error: Invalid input.");
				break;
			}
		}

	}
		
}
