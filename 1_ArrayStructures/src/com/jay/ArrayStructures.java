package com.jay;

public class ArrayStructures {
	
	private int[] theArray = new int[50];
	
	private int arraySize = 10; //marks the "virtual" size of the array.
	
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
		//for(int i =0;i<theArray.length;i++) { //TRUE SIZE of the array
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
		
		//boolean valueInArray = false;
		
		for(int i=0;i<arraySize;i++) {
			if(theArray[i] == searchValue) return true; //return true if found search value in array
		}
		
		return false;
	}
	
	//----------------------------------------
	//delete an index in the array:
	
	public void deleteIndex(int index) {
		
		if(index<arraySize) { //check that target index actually exists!
			for(int i=index; i < (arraySize - 1); i++) { 	//(arraysize -1) takes us to the sedond last element
				theArray[i] = theArray[i+1]; //each element in the array becomes the value of its next 
			}
		}
		
		arraySize--; //decrement the array size, as were now one element short
	}
	
	//----------------------------------------
	//insert values into the array:
	
	public void insertValue(int value) {
		
		if(arraySize < 50) { //keep array sise below 50 (the max assigned amount)
			
			theArray[arraySize] = value; //add the value to the end of the array (because of 0 indexing this will target the first empty element)
			
			arraySize++; //add to the variable holding the size of the array 
		}
	}
	
	//----------------------------------------
		
	public static void main(String[] args) {
		
		//create an array:
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		
		//print array:
		newArray.printArray();
		
		//find value at a target index:
		System.out.println(newArray.getValueAtIndex(5));
		
		//check if a value is in the array:
		System.out.println(newArray.doesArrayContainValue(10));
		
		//delete an index:
		newArray.deleteIndex(3);
		newArray.printArray(); //print new array to show index is deleted
		
		//insert a value into array:
		newArray.insertValue(33);
		newArray.printArray(); //print new array to show added value
		
		//----------------------------------------
		
		
		
		
	}

}
