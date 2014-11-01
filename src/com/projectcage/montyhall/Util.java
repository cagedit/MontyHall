package com.projectcage.montyhall;

import java.util.Random;

public class Util
{
	public static int RandomNum(int low, int high)
	{
		Random r = new Random(System.nanoTime());
		return r.nextInt(high - low + 1) + (low);
	}
	
	public static void print(String s)
	{
		System.out.println(s);
	}
}
