package com.projectcage.montyhall;

public class Host
{
	public static void main(String[] args)
	{
		int stayWins = 0;
		int switchWins = 0;
		double iterations = 100000;
		
		for (int i = 0; i < iterations; i++) {
			Doors doors = new Doors();
			String door1 = doors.pickDoor();
			doors.removeGoat();
			String door2 = doors.change();
			if (door1 == "Car") {
				stayWins++;
			} else if(door2 == "Car") {
				switchWins++;
			}
		}
		switchWins = (int) (switchWins / iterations * 100);
		stayWins = (int) (stayWins / iterations * 100);
		Util.print("Switch wins: " + switchWins + "%");
		Util.print("Stay wins: " + stayWins + "%");
		
	}
}
