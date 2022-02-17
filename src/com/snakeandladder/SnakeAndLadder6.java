package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder6 {

	public static void main(String[] args) {
		int playerposition = 0;
		int dice;
		int temp;
		int cntdice = 0;
		int cntpos = 0;
		System.out.println("Welcome to Snake And Ladder program");
		System.out.println("Player at start position " + playerposition);
		while (playerposition <= 100) {
			dice = rollDice();
			cntdice++;
			int t = playerposition;
			playerposition = Location(dice, playerposition);
			if (playerposition > t)
				cntpos++;
		}
		if (playerposition > 100) {
			temp = playerposition - 100;
			playerposition = playerposition - temp;
			System.out.println("Win the game player position is : " + playerposition);
			System.out.println("No of Count Dice : " + cntdice);
			System.out.println("No of Count player position : " + cntpos);

		} else {
			System.out.println("Win the game player position is : " + playerposition);
			System.out.println("No of Count Dice : " + cntdice);
			System.out.println("No of Count player position : " + cntpos);
		}
	}

	public static int rollDice() {
		Random random = new Random();
		int dice = random.nextInt(6);
		dice = dice + 1;
		return dice;
	}

	public static int Location(int dice, int playerposition) {
		Random random = new Random();
		int l = random.nextInt(2);
		l = l + 1;
		//Maping Method

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

}
