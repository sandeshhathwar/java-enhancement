/*
 *Write a program to calculate average 
 */
package com.arrays.examples;

/**
 * @author Suhas
 *23-May-2020 12:04:07 pm
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static double average(int[] marks) {
		double sum = 0.0;
		double avg = 0.0;
		for(int i=0;i < marks.length;i++)
		{
			sum=sum+marks[i];
		}
		avg = sum/marks.length;
		return avg;
	}
	public static void main(String[] args) {
		int[] score= {54,65,68,57};
		double res = average(score);
		System.out.println("result = "+ res);
	}

}
