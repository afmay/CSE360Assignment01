//Name: Austyn May CSE 360 Assignment 01

package cse360assignment02;


public class AddingMachine {
	
	private int total;
	private String b = "0";
  
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	  
	public int getTotal () { // returns current total
		return total;
	}
  
	public void add (int value) { //adds parameter to the total variable
		total = total + value;
		b = b + " + " + value;
	}
  

	public void subtract (int value) { //subtracts parameter from the total variable
		total = total - value;
		b = b + " - " + value;
	}

	public String toString () { //returns a history of the transactions
		return b;
	}

	public void clear() { //clears memory
		total = 0;
		b = "0";
	}
	
}


