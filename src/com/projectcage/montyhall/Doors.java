package com.projectcage.montyhall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Doors
{
	private ArrayList<String> doors = new ArrayList<String>();
	
	public Doors()
	{
		this.doors.add("Goat");
		this.doors.add("Goat");
		this.doors.add("Car");
		this.randomizeDoors();
	}
	
	public void randomizeDoors()
	{
		long seed = System.nanoTime();
		Collections.shuffle(this.doors, new Random(seed));
	}
	
	public String pickDoor()
	{
		int num = Util.RandomNum(0, 2);
		String result = this.doors.get(num);
		this.doors.remove(num);
		return result;
	}
	
	
	public void removeGoat()
	{
		for (int i = 0; i < this.doors.size()-1; i++) {
			if (this.doors.get(i) == "Goat") {
				this.doors.remove(i);
				return;
			}
		}
	}
	
	public String change()
	{
		return this.doors.get(0);
	}
}
