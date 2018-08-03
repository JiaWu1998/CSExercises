import java.lang.Math;
public class Problem7App{
  public static void main(String[] args){
    int[] arr1 = new int[10];
    // for(int g=0; g<10; g++){
    //   arr1[g] = (int) Math.ceil(Math.random() * 10.0);
    //   System.out.println(arr1[g]);
    // }
    // System.out.println("Hey");
    // int[] arr2 = accept(4,5,arr1);
    // for(int g=0; g<10; g++){
    //   System.out.println(arr2[g]);
    // }
    // System.out.println("Hey");
    // for(int g=0; g<10; g++){
    //   System.out.println(arr1[g]);
    // }
    //rest is easy
  }
  public static int[] accept(int num1, int num2, int[] arrInt){
    int holder = arrInt[num1];
    arrInt[num1] = arrInt[num2];
    arrInt[num2] = holder;
    return arrInt;
  }
}
