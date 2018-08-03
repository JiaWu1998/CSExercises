public class Wk2_Assign{
  public static void main(String[] args){
    Coin none = new Coin();
    Coin penny = new Coin("Penny", 0.01);
    Coin nickel = new Coin("Nickel", 0.05);
    Coin quarter = new Coin("Quarter", 0.25);
    Coin dollarCoin = new Coin("Dollar", 1.00);

    for(int i=1; i<=5;i++){
      System.out.println(penny.toss());
    }

    System.out.println("\n" + "penny + nickel = $" + penny.sumWith(nickel));
    System.out.println("nickel + penny = $" + nickel.sumWith(penny) + "\n");

    System.out.println("DollarCoin plus penny = $" + none.sumTwo(dollarCoin, penny));
    System.out.println("quarter + nickel = $" + none.sumTwo(quarter, nickel) + "\n");

    System.out.println("6 * quarter = $" + quarter.times(6));
    System.out.println("9 * nickel = $" + none.timesCoin(nickel, 9));
  }
}
