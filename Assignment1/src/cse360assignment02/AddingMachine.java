package cse360assignment02;

public class AddingMachine {
  private int total;
  private String result = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  result = result + " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  result = result + " - " + value;
  }

  public String toString () {
    return result;
  }

  public void clear() {
	  result = "0";
	  total = 0;
  }
}
