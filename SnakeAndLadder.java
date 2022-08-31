package com.bl.Assignment;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int position = 0;
		System.out.println("Initial position of the player " +position);
		Random ran = new Random();
		int dice = ran.nextInt(6);
		System.out.println("Dice Outcome" +dice);
		
	}

}
