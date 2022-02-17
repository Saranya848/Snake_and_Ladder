package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder2 {

	public static void DiceRolled() {
		Random r = new Random();
		int dice = r.nextInt(6);
		dice = dice + 1;
		System.out.println("Dice Num : " + dice);

	}

	public static void main(String[] args) {
		int playerposition = 0;
		System.out.println("Welcome to Snake And Ladder program");
		System.out.println("Player at Start position " + playerposition);
		DiceRolled();
	}
}
