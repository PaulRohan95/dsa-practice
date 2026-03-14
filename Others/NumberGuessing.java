import java.util.Scanner; 
//imports the Scanner class from Java's standard library
//Scanner is used to read inputs from the user (e.g. via keyboard)

import java.util.Random;
//imports Random class
//We use this to generate a random number for the game to guess

public class NumberGuessing { 
    //Class: A class is a blueprint for Java objects
    //public: visible to all other classes
    //NumberGuessing: The name of the class. It must match the file name (NumberGuessing)
    
    public static void main(String[] args) { //main method: The entry point of any Java application
        //(String[] args): An array to accept command line arguments (not used here)
        //static: allows the method to be run without creating an object of the class.
        //void: It does not return a value

        Scanner scanner = new Scanner(System.in); //Creates a Scanner object named scanner
        //System.in= refers to the standard input (i.e., the keyboard)

        Random random = new Random(); //Creates a random object to generate random numbersx`

        int numberToGuess = random.nextInt(100) + 1; // 1 to 100; random.nextInt(100) gives a random number from 0 to 99
        //numberToGuess: stores the number the user needs to guess
        int numberOfTries = 0; //Keeps track of how many attempts the user makes
        int guess; //declares the variable to store the user's guess
        boolean hasWon = false; //a flag to indicate if the user has guessed the correct number

        System.out.println("Welcome to the Number Guessing Game!"); //used to print messages to the console
        System.out.println("I am thinking of a number between 1 and 100...");

        while (!hasWon) { //while loop runs as long as hasWon is false
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt(); //User Input--> Waits for the user to enter a number and stores it in guess
            numberOfTries++; //Increases the counter after each guess

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Correct! You guessd it in " + numberOfTries + " tries.");
            }
        }
        scanner.close(); //Closes the scanner to free up system resources. Always to be done when you are done with input
    }
}
