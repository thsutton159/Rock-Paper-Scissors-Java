import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		String[] rps = {"r", "p", "s"}; //string array to hold the different options (rock (r), paper (p), or scissors (s)
		Scanner scanner = new Scanner(System.in); //creates a scanner for user input
		
		while(true) { //loop to allow the user to play multiple times
			
			String computerMove = rps[new Random().nextInt(rps.length)]; // randomly sets the computer move to r, p, or s
			
			 String playerMove; // string to hold the player move
			 
			 while(true) { // loop to get user input 
				 
				 System.out.println("Please enter your move (r, p, or s)"); 
				 
				 playerMove = scanner.nextLine(); // gets player input
				 
				 if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					 break; // breaks out of the while loop on a valid input
				 }
				 
				 System.out.println(playerMove + " is not a valid move. Please try again."); // prints if an invalid input is detected
			 }
			 
			 System.out.println("Computer played: " + computerMove); // prints computer move 
			 
			 // if else structure to determine game outcome
			 
			 if(playerMove.equals(computerMove)) { // checks to see if user input equals computer move
				 
				 System.out.println("The game is a tie"); // prints only on ties
				 
			 } else if(playerMove.equals("r")) { // checks if the user chose rock (r)
				 
				 if(computerMove.equals("p")) { // checks if computer chose paper
					 
					 System.out.println("You lose :("); 
					 
				 } else if (computerMove.equals("s")) { // checks if computer chose scissors 
					 
					 System.out.println("You win :)");  
				 }
			 }  else if(playerMove.equals("p")) { // checks if user chose paper
				 
				 if(computerMove.equals("s")) { // checks if computer chose scissors
					 
					 System.out.println("You lose :("); 
					 
				 } else if (computerMove.equals("r")) { // checks if computer chose rock
					 
					 System.out.println("You win :)"); 
				 }
			 }  else if(playerMove.equals("s")) { // checks if user chose scissors
				 
				 if(computerMove.equals("r")) { // checks if computer chose rock
					 
					 System.out.println("You lose :(");
					 
				 } else if (computerMove.equals("p")) { // checks if computer chose paper
					 
					 System.out.println("You win :)");
				 }
			 }
			 
			 System.out.println("Want to play again? [y/n]"); //message to the user
			 
			 String playAgain = scanner.nextLine(); // gets user input
			 
			 if(!playAgain.equals("y")) {
				 break; // breaks if the user does not input 'y'
			 }
		}
		
		System.out.println("Have a nice day!"); 
		
		scanner.close(); // closes the scanner
	}
}
