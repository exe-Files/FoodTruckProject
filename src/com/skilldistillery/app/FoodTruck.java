package com.skilldistillery.app;

public class FoodTruck {
	/*
	 * You will define a FoodTruck class with fields for a unique numeric id, a name
	 * ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel",
	 * etc.), and a numeric rating.
	 */

	private static int numID = 0; // unique numeric id 
	public String name; // "TacoRific", etc
	public String foodType; // "Tacos"
	public int rating; // 1 - 5 stars
	public String[] allTrucks;
	
	public FoodTruck() {}; //no argument constructor, may be unnecessary to run program
		{
			this.numID = newNumID();
		}
		
	public FoodTruck(int numID, String name, String foodType, int rating) {
			this.numID = newNumID(); //this may take care of having to increment each ID individually
			this.name = name; 
			this.foodType = foodType; 
			this.rating = rating;
	}


	public String[] listAllFoodTrucks(){
		return allTrucks;
	
	}

	public double averageRatingFoodTrucks() {
		    return 0.0;
		  }

//	public void highestRatedFoodTruck() {
//		balance = balance + amount;
//	}


	
	public int getNumID() {
		return numID;
	}
	public int newNumID() {
		this.numID = numID++;
		return numID; 
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}