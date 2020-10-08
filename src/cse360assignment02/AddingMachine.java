package cse360assignment02;

/**
 * AddingMachine represents an Adding Machine capable of adding
 * and, subtracting, and displaying numbers
 */ 
public class AddingMachine {
  private int total;
  
  /**
   * Constructs Adding Machine and initializes total to 0
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Accessor to the total value
   * @return the total value so far
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * Method to add an integer to total
   * @param value the integer to add to the total
   */
  public void add (int value) {
  }

  /**
   * Method to subtract an integer from the total
   * @param value the integer to subtract
   */
  public void subtract (int value) {
  }

  /**
   * Method to represent the instance as the history of operations
   * @return AddingMachine history as string
   */
  public String toString () {
    return "";
  }

  /**
   * Clears the adding machine
   */
  public void clear() {
  }
}