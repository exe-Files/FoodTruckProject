package com.skilldistillery.app;

public class FoodTruck {

	// FIELDS
	private static int count = 0; // increments each time the constructor is called
	private int numID = 0; // unique numeric id based off count
	public String name;
	public String foodType;
	public int rating;

	// CONSTRUCTOR
	public FoodTruck() {
		numID = count++; //increments and then is assigned to numID
	};

	public FoodTruck(int numID, String name, String foodType, int rating) {
		this.numID = count++;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	// METHODS

	@Override
	public String toString() {
		return "FoodTruck [numID=" + numID + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating + "]";
	}

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
