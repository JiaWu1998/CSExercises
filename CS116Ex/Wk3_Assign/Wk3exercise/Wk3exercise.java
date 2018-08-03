import java.util.Scanner;
public class Wk3exercise{
  //application
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is length?");
    String sen1 = scan.next();
    double num1 = Double.parseDouble(sen1);
    System.out.println("What is width?");
    String sen2 = scan.next();
    double num2 = Double.parseDouble(sen2);


    Rectangle rec1 = new Rectangle();
    Rectangle rec2 = new Rectangle();
    rec1.setWidth(num2);
    rec1.setLength(num1);

    System.out.println(rec2.getAreaOf(rec1));
  }
}
