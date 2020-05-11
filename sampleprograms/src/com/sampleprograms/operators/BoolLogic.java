package com.sampleprograms.operators;

public class BoolLogic {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = !a;
		
		System.out.println(" logical OR = " + c);
		System.out.println(" logical AND = " + d);
		System.out.println(" logical XOR = " + e);
		System.out.println(" logical NOT = " + f);
	}

}
