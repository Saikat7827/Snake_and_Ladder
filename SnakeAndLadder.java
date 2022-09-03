package com.bl.Assignment;

import java.util.Random;

public class SnakeAndLadder {
	static final int Snake = 2;
	static final int ladder = 1;
	static final int Ladder = 1;
	static final int Noplay = 0;

	public static void main(String[] args) 
	{
		int position = 0;
		Random ran = new Random();
		int dice = ran.nextInt(6)+1;
		System.out.println("dice: "+dice);
		System.out.println("Initial Position is "+position);

		int optionCheck = ran.nextInt(3);
		System.out.println("optionCheck: "+optionCheck);

		if (optionCheck == ladder) 
		while (position<100) 
		{
			System.out.println("Ladder");
			position = position + dice;
		}

		else if (optionCheck == Snake && position > dice) 
		{
			System.out.println("Snake");
			position = position - dice;
		}
		else {
			System.out.println("No Play");
			Random ran1 = new Random();

			int dice1 = ran1.nextInt(6)+1;
			System.out.println("Dice Outcome "+dice1);

			int optionCheck1 = ran1.nextInt(3);
			System.out.println("optionCheck: "+optionCheck1);


			if (optionCheck1 == Ladder) 
			{
				System.out.println("Ladder");
				position = position + dice1;
			}
			else if (optionCheck1 == Snake) 
			{
				System.out.println("Snake");
				position = position - dice1;
			}
			else 
			{
				System.out.println("NoPlay");
			}
			if (position<0) 
			{
				position =0;
			}
			System.out.println("Position :"+position);
		}
		System.out.println("position: "+position);
	}

	}

