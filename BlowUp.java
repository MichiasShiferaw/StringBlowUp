//Scan all primitive data types
import java.util.Scanner;

public class BlowUp {
  
  public static String blowup(String str) {
    //Create a stringbuilder that will represent a sequence of characters
    StringBuilder userLineOfString = new StringBuilder();
    
    
    //Have the counter represent the number of characters
    //The counter is at -1 so it will start at the first character
    int counter = -1;

    //Start a for loop by making the characters in the string into a array
    for (char character: str.toCharArray()) {
      //If the counter reads a digit as a character it will go to the next line
      if (counter < 0 && Character.isDigit(character)) {
        //this method returns the numeric value of the character, as a non-negative int value.
        counter = Character.getNumericValue(character);
      } else {
        //Creating a do while statement
        do {
          userLineOfString.append(character);
          //The decreement statement must be equal to the value of 0
        } while (--counter >= 0);
      }
    }
    //Return the variable back to the top of the FOR loop after an execution is complete.
    return userLineOfString.toString();
  }
  
  //Sources from https://stackoverflow.com/questions/19150171/a-string-blowup-method
  public static void main(String[] args) throws java.lang.Exception {
  
    //Output
    System.out.println(blowup("1t2x"));
    System.out.println(blowup("a3tx2zz"));
    System.out.println(blowup("3end5"));
  }
}
