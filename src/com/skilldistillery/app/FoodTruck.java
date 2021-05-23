package com.skilldistillery.app;

public class FoodTruck {
	
	//FIELDS
	private static int count = 0; //increments each time the constructor is called
	private int numID = 0; // unique numeric id based off count
	public String name; 
	public String foodType; 
	public int rating;

	
	//CONSTRUCTORS
	public FoodTruck() {
		numID = count++;
	}; 
	
		
	//METHODS

	public int getNumID() {
		return numID;
	}

	public int newNumID(int numID) {
		this.numID = numID;
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
//	public int addFoodTruck(FoodTruck t) {
//		foodTrucksReviewed[numID] = t; 
//		numID++;
//		return numID;
//	}

//	public FoodTruck[] listAllFoodTrucks() {
//		FoodTruck[] trucksCopy = new FoodTruck[numID];
//		//initializes an array the size of the food trucks input
//	    for(int i=0; i < numID; i++) {
//	      trucksCopy[i] = foodTrucksReviewed[i];
//	    }
//	    
//	    return trucksCopy; //returns a copy of food trucks
//		//only return values that aren't null!
//		
//
//	}


//	public double averageRatingFoodTrucks() {
//		System.out.println(0.0);
//		return 0.0;
//	}

//	public void highestRatedFoodTruck() {
//		balance = balance + amount;
//	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("FoodTruck [name=");
//		builder.append(foodTrucksReviewed[0].name);
//		builder.append(", foodType=");
//		builder.append(foodTrucksReviewed[0].foodType);
//		builder.append(", rating=");
//		builder.append(foodTrucksReviewed[0].rating);
//		builder.append(", allTrucks=");
//		builder.append(Arrays.toString(foodTrucksReviewed));
//		builder.append("]");
//		return builder.toString();
//	}

//	public void newTruckID(FoodTruck t) {
//		foodTrucksReviewed[numID] = t;
//		numID++; // increment to reflect that we have one more truck
//	}