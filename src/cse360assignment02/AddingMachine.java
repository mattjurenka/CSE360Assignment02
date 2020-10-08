package cse360assignment02;

import java.util.ArrayList;

/**
 * AddingMachine represents an Adding Machine capable of adding
 * and, subtracting, and displaying numbers
 */ 
public class AddingMachine {
  private int total;
  private ArrayList<String> history;
  
  /**
   * Constructs Adding Machine and initializes total to 0
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new ArrayList<String>();
    history.add("0");
  }
  
  /**
   * Accessor to the total value
   * @return the total value so far
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Method to add an integer to total
   * @param value the integer to add to the total
   */
  public void add (int value) {
	  total += value;
	  history.add("+ " + value);
  }

  /**
   * Method to subtract an integer from the total
   * @param value the integer to subtract
   */
  public void subtract (int value) {
	  total -= value;
	  history.add("- " + value);
  }

  /**
   * Method to represent the instance as the history of operations
   * @return AddingMachine history as string
   */
  public String toString () {
    return String.join(" ", history);
  }

  /**
   * Clears the adding machine
   */
  public void clear() {
	  history = new ArrayList<String>();
	  history.add("0");
	  total = 0;
  }
}