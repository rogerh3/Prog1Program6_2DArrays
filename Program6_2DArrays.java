//This does not work right -- for future reference if I ever go back to look at it
//Project: Project 6
//Author: Roger H Hayden III
//Desc: Random 2D Array Game
//Version: 1.0
//Last Update: 11/3

import java.util.Scanner; 
import java.util.Random; 


public class Program6_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Introduce game
		System.out.println("Welcome to Arrowball!");
		System.out.println("=================================================================="); 
		System.out.println("\n\nArrowball is a game where someone shoots a bow and arrow at a ball \nin the air and attempts to ricochet the ball go through the opponents goals.");
		System.out.println("\n\n=================================================================="); 
		
		//initializing scanner
		Scanner keyboard = new Scanner (System.in); 
		
		//ask for number of innings
		System.out.println("\n\nHow many innings would you like to play?");
		int innings = keyboard.nextInt();
		
		
		//creating the matrix for scores
		//2 is for 2 teams
		int[][] scores = new int[2][innings]; 
		
		//initializing random number generator
		Random randomNumber = new Random(); 
		
		int teamOneTotal = 0;
		int teamTwoTotal = 0; 
		
		String teamOne = "";
		String teamTwo = ""; 
	
		for (int col = 0; col<scores[0].length; col++) {
			for(int row = 0; row< scores.length; row++) {
				//team one info
				if(row == 0) {
					int diceRoll = randomNumber.nextInt(30) + 1;
					System.out.println("The score for Team One in Quarter " + (col+1) + ": " + diceRoll); 
					scores[row][col] = diceRoll; 
					teamOneTotal+=scores[row][col];
					teamOne = teamOne + scores[row][col] + "\t"; 
				}
				//team two info
				if(row == 1) {
					int diceRoll = randomNumber.nextInt(30) + 1; 
					System.out.println("The score for Team Two in Quarter " + (col+1) + ": " + diceRoll); 
					scores[row][col] = diceRoll; 
					teamTwoTotal+=scores[row][col]; 
					teamTwo = teamTwo + scores[row][col] + "\t"; 
				}
			}
		}
		
		//output team totals
		
		System.out.println("Team One's score: " + teamOne + teamOneTotal);
		System.out.println("Team Two's score: " + teamTwo + teamOneTotal);
		
		//who won
		if(teamOneTotal==teamTwoTotal) {
			System.out.println("The Teams Tied!");
		} else if (teamOneTotal > teamTwoTotal){
			System.out.println("Team One won the game!"); 
		} else if (teamOneTotal < teamTwoTotal) {
			System.out.println("Team Two won the game!"); 
		}else {
			System.out.println("I guess your game did not work"); 
		}
		
		//closed the keyboard
		keyboard.close();
		
		
	}
}
