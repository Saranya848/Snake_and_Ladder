package com.snakeandladder;
import java.util.*;
public class SnakeAndLadder3 {

    public static int rollDice(){
        Random random = new Random();
        int dice = random.nextInt(6);
        dice = dice+1;
        System.out.println("Dice Num : "+ dice);
        return dice;
    }
    
    public static void Location(int dice, int playerposition){
        Random random = new Random();
        int l = random.nextInt(2);
        l = l +1;
        System.out.println("Location : "+ l);

		if (l == 0) {
			System.out.println("No Play the Player stays in the same position");
		} else if (l == 1) {
			playerposition += dice;
			System.out.println("Position after ladder = " + playerposition);
		} else {
			playerposition = playerposition - dice;
			System.out.println("The Position after snake = " + playerposition);
		}
    }
    public static void main(String[] args) {
	    int playerposition = 0;
	    int dice = 0;
        System.out.println("Welcome to Snake And Ladder program");
        System.out.println("Single player at start position "+ playerposition);
        dice = rollDice();
        Location(dice, playerposition);
    }
}
