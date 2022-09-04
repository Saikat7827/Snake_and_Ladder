package com.bl.Assignment;

import java.util.Random;

public class SnakeAndLadder {
	static final int Snake = 2;
	static final int Ladder = 1;
	static final int Noplay = 0;
	
	
	public static void main(String[] args) {
		
		int position = 0;
		System.out.println("Initial Position is "+position);
		System.out.println("position: "+position);

		while (position<100) 
		{
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("Dice outcome "+dice);
			System.out.println("dice: "+dice);
			
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			if (optionCheck == Ladder) 
				if ((optionCheck == Ladder) && (position+dice)<=100) 
				{
		System.out.println("Ladder");
		position = position + dice;
				}
			else if (optionCheck == Snake)
			{
				System.out.println("Snake");
				position = position - dice;
				
			}
			else {
				System.out.println("NoPlay");
				System.out.println("NoPlay");
			}
			if (position<0) 
			{
				System.out.println("Position: "+position);
				System.out.println("position: "+position);
				
				
			}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}


