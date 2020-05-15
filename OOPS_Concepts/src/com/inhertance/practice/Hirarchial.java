/*
 * 
 */
package com.inhertance.practice;

/**
 * @author Suhas
 *12-May-2020 5:30:58 pm
 */
class Language{
	public void commonlang()
	{
		System.out.println("Kannada");
	}
}
class English extends Language
{
	public void lang1()
	{
		System.out.println("English");
	}
}

class Hindi extends Language
{
	public void lang2()
	{
		System.out.println("Hindi");
	}
}
public class Hirarchial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		English E = new English();
		E.commonlang();
		E.lang1();
		Hindi H = new Hindi();
		H.commonlang();
		H.lang2();
	}

}
