package com.jay;

public class ArrayStructures {
	
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	//----------------------------------------
	public static void main(String[] args) {
		
		//create an array:
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		
		//print array:
		newArray.printArray();
		
		//find value at a target index:
		System.out.println(newArray.getValueAtIndex(5));
		
		
	}
	
	//----------------------------------------
	//generate an array of random ints:
	
	public void generateRandomArray() { 
		for(int i=0;i<arraySize;i++) {
			theArray[i] = (int)(Math.random()*10)+10; //random number between 10 & 19
		}
	}
	
	//----------------------------------------
	//print array:
	
	public void printArray() {
		System.out.println("---------------");
		for(int i =0;i<arraySize;i++) {
			System.out.print(" | " + i + " | ");
			System.out.println(theArray[i] + " | ");
		}
		System.out.println("---------------");
	}

	//----------------------------------------
	//return array value at a target index:
	
	public int getValueAtIndex(int index) {
		//if index given is less than array size:
		if(index < arraySize) return theArray[index];  
		return 0; //else return 0
	}
	//----------------------------------------
	//check array for a target value:
	
	public boolean doesArrayContainValue(int searchValue) {
		
		boolean valueInArray = false;
		return true;
	}
	
	//----------------------------------------
	

}
