import java.util.Random;
import java.lang.Math;
public class Exercise1{
  public static void main(String arg[]){
    Random num = new Random();
    int pageMin = 501;
    int pageMax = 0;
    int salesMin = 201;
    int salesMax = 0;

    for(int h=0; h<120; h++){
      int pageVisits = num.nextInt(301)+200;
      if(pageVisits > pageMax){
        pageMax = pageVisits;
      }else if(pageVisits < pageMin){
        pageMin = pageVisits;
      }
    }
    System.out.println("Min Hit:"+pageMin);
    System.out.println("Max Hit:"+pageMax);
    for(int h=0; h<120; h++){
      int sales = (int) (Math.random() * 151)+50;
      if(sales > salesMax){
        salesMax = sales;
      }else if(sales < salesMin){
        salesMin = sales;
      }
    }
    System.out.println("Min Sales:"+salesMin);
    System.out.println("Min Sales:"+salesMax);

    for(int d=1; d<=5;d++){
      int hitt = num.nextInt(301)+200;
      int salees = (int) (Math.random() * 151)+50;
      System.out.println(Math.round(returnPercent(salees,hitt)*10000.0) / 100.00  + "%");
    }
  }
  public static double returnPercent(int sale, int hit){
    return ((double) sale / (double) hit);
  }

}
