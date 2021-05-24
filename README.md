# Food Truck Project

### Overview
This program simulates a review site for a Food Truck. It takes in the inputs of up to five different trucks, including the name, type of food, and the rating. 
Once the user has input their ratings, a menu will be presented and the user can choose from the selection.

### Technologies Used
- Java 
- Conditionals
- Looping
- Classes
- Objects 
- Methods

### How to Run
- In order to run, you must run a version of Java 1.8 or later and a copy of Eclipse. 
- Open Eclipse and import the project
- Run Java FoodTruckApp. This will pull from the FoodTruck class. 
- Input up to  five Food Trucks you would like to review, including the name, type of food they serve, and your rating. 
- When you've entered all five, the program will continue, or you can also enter 'quit' into one of the name field prior. 
- A menu will populate and allow you to select an output based on a number you input
- Voila, you're done!

### Lessons Learned
Working on this project has brought to my own attention how shakey I am when it comes to a lot of these concepts, especially classes and objects. 
One area I would like to focus on more is creating methods out of blocks of code I can use repeatedly, refactoring my code as I go, in order to save space and increase readability. 
I was originally using Scanner.nextInt() for the ratings input, but when the for loop occured and prompted for the name again, nextLine() would accept the 'enter' the user would have input previously. nextInt() only reads in the number that user typed, not the new line that occured when they hit 'enter'. In order to get past this limitation, I had resort to using nextLine as well as Integer.parseInt() in order to extract just the integer that the user would input. 

Static fields also led to some trouble at first. Figuring out how to create a unique ID for each instance of the FoodTruck class had me looking through and comparing examples for a fair bit. In fact, I almost went the route of creating a third class file so that I would be able to emulate an example from class earlier that day that involved keeping track of each instance with an array. I realized how hacked together my code was starting to look, so I decided I needed to keep things as basic as possible and really try to answer the questions at hand: How could I get a static variable to change only when a new instance occured, and how would I be able to assign that value to it without it being shared? I decided to use a static int, so that its value would change and persist after each count of the constructor called, and use another int for the unique number ID assigned to each instance, based on the new count value. 

One of the concepts I struggled with the most during this project was creating and using an array of a class type I created. Understanding how to properly parse and even get info out of an array, with methods created by me, proved really difficult throughout this challenge, and it was where most of my headaches sparked from. I received many null pointer errors along the way, but taking the time to figure out how Java handles objects in an array and how to properly pull the data out that you want will be beneficial for the work ahead. 

Overall, I really enjoyed working on this project, and I would love to return to it when I have the chance to make it more concise and efficient, as well as really drive home these concepts. 
