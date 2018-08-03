public class Testingtest{
  public static void main(String[] args){
    System.out.println(sumOf(3,4));
    System.out.println(averageOf(3,4));
  }
  public static int sumOf(int num1, int num2){
    return num1 + num2;
  }
  public static double averageOf(int num1, int num2){
    return (double) (num1 + num2)/2.0;
  }
}
