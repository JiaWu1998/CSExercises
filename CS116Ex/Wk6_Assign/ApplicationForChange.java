import java.lang.Math;
import java.util.Random;
public class ApplicationForChange{
  public static void main(String[] args){
    Coin dime = new Coin("dime",0.1);
    Coin nick = new Coin("nickel",0.05);
    int ranNum1 = getRandom();
    int ranNum2 = getRandom();
    Change chang1 = new Change(ranNum1,ranNum2,dime,nick);
    System.out.println("Total Change: " + chang1.calcChange());
    System.out.println(chang1);
    // I rather use the toString to show the num of coin because it have every you need in one pack
    // Using the accessors one by one is doing too much with the same output
  }
  public static int getRandom(){
    //return (int) Math.ceil(Math.random() * 10.0);
    return (new Random()).nextInt(10) + 1;
    // 0 is inclusive so add 1, 10 is exclusive;
    // Nothing changes UNLESS you want to remove the '+ 1'; it's behaves the same.
  }
}
