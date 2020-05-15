
/*
 * 
 */
package com.inhertance.practice;

/**
 * @author Suhas
 *12-May-2020 9:34:50 am
 */
class Grandfather
{
	public void assetgf()
	{
		System.out.println("Grandfather property");
	}
	}
class Father extends Grandfather
{
	public void assetf()
	{
		System.out.println("Father property");
	}
	}
class Son extends Father
{
	public void assets()
	{
		System.out.println("Son property");
	}
	}

public class Multilevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Son s = new Son();
		s.assets();
		s.assetgf();
		s.assetf();
	}

}
