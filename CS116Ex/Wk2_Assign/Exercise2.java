import java.util.Scanner;
public class Exercise2{
  public static void main(String[] args){
    // (1 point)   In an application class:
    //  prompt the user for an age; read the age as a String rather than a numeric value.  Use the wrapper class Integer to parse the String value to an integer.
    // Prompt the user for the body temperature in F; read the temperature as a String rather than a numeric value.  Use the wrapper class Double to parse the temperature to a double.
    Scanner scan = new Scanner(System.in);
    System.out.println("Age:");
    String age = scan.next();
    int age2 = Integer.parseInt(age);
    System.out.println("Temperature in F:");
    String temp = scan.next();
    double temp2 = Double.parseDouble(temp);
    System.out.println("Prove by temp*age = " + temp2*age2);
  }
}
