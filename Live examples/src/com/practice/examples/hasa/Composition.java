/*
 * 
 */
package com.practice.examples.hasa;

/**
 * @author Suhas
 *05-Jun-2020 7:46:40 am
 */
class Engine{
	int capacity;
	int size;
	Engine(int capacity, int size){
		this.capacity = capacity;
		this.size = size;
	}
	public void display() {
		System.out.println("The capacity of engine is "+capacity);
		System.out.println("The size of engine is "+size);
	}
}

class Cars{
	String name;
	int Seat_capacity;
	Cars(String name,int Seat_capacity){
		this.name = name;
		this.Seat_capacity = Seat_capacity;
	}
	 Engine E = new Engine(10,20);
}

public class Composition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars C = new Cars("Fiat",10);
		C.E.display();
	}

}
