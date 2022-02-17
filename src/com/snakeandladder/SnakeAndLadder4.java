package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder4 {
	public static int rollDice() {
		Random random = new Random();
		int dice = random.nextInt(6);
		dice = dice + 1;
		return dice;
	}

	public static int mapTo(int dice, int playerposition) {
		Random random = new Random();
		int l = random.nextInt(2);
		l = l + 1;
		// Maping Method

		if (l == 0) {
			System.out.println("No Play the Player stays in the same position");
		} else if (l == 1) {
			playerposition += dice;
			System.out.println("Position after ladder = " + playerposition);
		} else {
			playerposition = playerposition - dice;
			System.out.println("The Position after snake = " + playerposition);
		}
		return playerposition;
	}

	public static void main(String[] args) {
		int playerposition = 0;
		int dice;
		System.out.println("Welcome to Snake And Ladder program");
		System.out.println("Payer at start position " + playerposition);

		while (playerposition <= 100) {
			dice = rollDice();
			playerposition = mapTo(dice, playerposition);
		}
		System.out.println("Win the game pos is : " + playerposition);
	}
}
