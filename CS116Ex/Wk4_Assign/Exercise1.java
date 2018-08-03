public class Exercise1{
  public static void main(String[] args){
    Rectangle rec1 = new Rectangle();
    Rectangle rec2 = new Rectangle(3,4);
    Rectangle rec3 = new Rectangle(5,6);

    System.out.println(rec2.getArea());
    System.out.println(rec1.getAreaOf(rec3));


  }
}
