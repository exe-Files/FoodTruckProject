package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * User Story #1 
		 * The user is prompted to input the name, food type, and rating
		 * for up to five food trucks. For each set of input, a FoodTruck object is
		 * created, its fields set to the user's input, and it is added to the array.
		 * The truck id is not input by the user, but instead assigned automatically in
		 * the FoodTruck constructor from a static field that is incremented as each
		 * truck is created. 
		 * */
		
		/*
		 * User Story #2 
		 * If the user inputs quit for the food truck
		 * name, input ends immediately and the program continues. 
		 * 
		 * */
		
		String input = ""; //TODO change this to a stringBuilder
		for (int i = 1; i <= 5; i++) {
				System.out.println("*** Please input the name, food type, and your rating for food truck " + i +" ***");
				System.out.println("Name " + i + ": ");
				//TODO turn this into a method for input validation
				input = scanner.next();
				if(input.equalsIgnoreCase("Quit") || input.equalsIgnoreCase("Q")) { //checks to see if user input quit
					break; //moves to next part of program
				}else {
					FoodTruck truck = new FoodTruck(); //initialize an instance of truck 
					truck.setName(input); //inputs name from earlier
					System.out.println("What kind of food does " + truck.getName() +" serve?: ");
					String foodType = scanner.next(); //next line causing issues, next instead
					truck.setFoodType(foodType);
					System.out.print("Your rating (1 - 5): ");
					int rating = scanner.nextInt();
					truck.setRating(rating);
					System.out.println();
					
				}
				
			}
		
		
		/*
		 * User Story #3 
		 * After input is complete, the user sees a menu from which they can choose to:
		 * List all existing food trucks. See the average rating of food trucks. Display
		 * the highest-rated food truck. Quit the program. 
		
		
		 * User Story #4 
		 * After choosing a menu item, the user sees the menu again and can choose another item until
		 * they choose to quit.
		 */

		//TODO displayMenu method
		int userChoice = 0;
		FoodTruck choice = new FoodTruck();
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
				choice.listAllFoodTrucks();
				break;
			case 2:
				choice.averageRatingFoodTrucks();
				break;
			case 3:
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
