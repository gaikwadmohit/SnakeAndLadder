package snakeAndLaddar;

import java.util.Scanner;

public class UC2 {
	
	
	    public static void main(String[] args) {
	        int playerPosition = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter Player Name: ");
	        String playerName = s.next();
	        int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
	        
//	        int diceRoll = (int) Math.floor(Math.random() *   6 + 1);
	        System.out.println("The Number of dice is:" + diceRoll);
	    }
	}



