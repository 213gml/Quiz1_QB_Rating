package cisc181.glacurts;

import java.util.Scanner;

public class Main {
	
	//Declares variables for each of the 5 statistics in the QB rating equation
	float passAttempt, numCompletions, passingYards, touchPasses, interceptions;
	
	//User inputs values for each of the 5 variables
	public void userInput() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of passing attempts (ATT): ");
		passAttempt = input.nextFloat();
		
		System.out.println("Enter the number of completions (COMP): ");
		numCompletions = input.nextFloat();
		
		System.out.println("Enter the total number of passing yards (YDS): ");
		passingYards = input.nextFloat();
		
		System.out.println("Enter the number of touchdown passes (TD): ");
		touchPasses = input.nextFloat();
		
		System.out.println("Enter the number of interceptions (INT): ");
		interceptions = input.nextFloat();
		
	}
	
	//Uses the input variables to calculate the QB rating
	public void Formulas() {
		
		float compATT, yardsATT, touchATT, intATT, passerRating;
		
		compATT = (float) (((numCompletions / passAttempt) - .3) * 5);
		yardsATT = (float) (((passingYards / passAttempt) - 3) * .25);
		touchATT = (float) ((touchPasses / passAttempt) * 20);
		intATT = (float) (2.375 - ((interceptions / passAttempt) * 25));
		passerRating = (float) (((compATT + yardsATT + touchATT + intATT) / 6) * 100);
		passerRating = (float) (Math.round(passerRating * 10.0) / 10.0);
		
		//Outputs the QB rating to the user
		System.out.println("The player's QB rating is " + passerRating);
		
	}

	//Executes the program
	public static void main(String[] args) {

		Main exe = new Main();
		exe.userInput();
		exe.Formulas();
		
	}

}
