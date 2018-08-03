import java.lang.Math;
public class Exercise1{
  public static void main(String[] args){
    int countRoll = 0;
    boolean allThreeCon = false;
    boolean snakeEye = false;
    boolean boxCar = false;
    boolean doubleTrouble = false;
    int dice1 = 0;
    int dice2 = 0;
    boolean prints;

    while(allThreeCon != true){
      prints = false;
      dice1 = diceRoll(6);
      dice2 = diceRoll(6);

      //this if statments acts as locking mechanism for the conditions.
      if(snakeEye != true){
        snakeEye = (((dice1 == 2)&&(dice2 == 1)) || ((dice1 == 1)&&(dice2 == 2))) ? true :  false;
        if(snakeEye){
          System.out.println("Dice 1: "+dice1+" Dice 2: "+dice2+" --Snake Eye");
          prints = true;
        }
      }
      if(boxCar != true){
        boxCar = (((dice1 == 2)&&(dice2 == 6)) || ((dice1 == 6)&&(dice2 == 2))) ? true :  false;
        if(boxCar){
          System.out.println("Dice 1: "+dice1+" Dice 2: "+dice2+" --Box Car");
          prints = true;
        }
      }
      if(doubleTrouble != true){
        doubleTrouble = (dice1 == dice2) ? true : false;
        if(doubleTrouble){
          System.out.println("Dice 1: "+dice1+" Dice 2: "+dice2+" --Double");
          prints = true;
        }
      }

      if(prints != true){
        System.out.println("Dice 1: "+dice1+" Dice 2: "+dice2);
      }
      allThreeCon = (snakeEye && boxCar && doubleTrouble) ? true : false;
      countRoll++;
    }
    System.out.println("There are "+(countRoll-1)+" rolls.");
  }
  public static int diceRoll(int numSides){
    return (int) Math.ceil(Math.random()* numSides);
  }
}
