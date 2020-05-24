/*
 * Given the URL print the  application name
 * Example: com.whatsapp.media   whatsapp is the application 
*/
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 11:55:44 am
 */
public class Example5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String URL= "com.whatsapp.media";
		String res= "";
		for(int index = 4;index<URL.length();index++)
		{
			if(URL.charAt(index)=='.')
			{
				break;
			}
			else
			res = res+URL.charAt(index);
		}
		System.out.println(res);

	}

}
