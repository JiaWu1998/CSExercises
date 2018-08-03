public class Change{
  private Coin coin1;
  private Coin coin2;
  private int num1;
  private int num2;

  public Change(){
    coin1 = new Coin();
    coin2 = new Coin();
    num1 = 0;
    num2 = 0;
  }
  public Change(int n1, int n2, Coin c1, Coin c2){
    coin1 = c1;
    coin2 = c2;
    num1 = n1;
    num2 = n2;
  }
  public void setCoinOne(Coin co1){
    coin1 = co1;
  }
  public void setCoinTwo(Coin co2){
    coin2 = co2;
  }
  public void setNumOfCoinOne(int nm1){
    num1 = nm1;
  }
  public void setNumOfCoinTwo(int nm2){
    num2 = nm2;
  }
  public Coin getCoinOne(){
    return coin1;
  }
  public Coin getCoinTwo(){
    return coin2;
  }
  public int getNumOfCoinOne(){
    return num1;
  }
  public int getNumOfCoinTwo(){
    return num2;
  }
  public String toString(){
    return num1 + " of Coin1: " + coin1 + ", " + num2 +" of Coin2: " + coin2;
  }
  public boolean equals(Change chang1){
    if((this.coin1 == chang1.getCoinOne())&&(this.coin2 == chang1.getCoinTwo())&&(this.num1 == chang1.getNumOfCoinOne())&&(this.num2 == chang1.getNumOfCoinTwo())){
      return true;
    }else{
      return false;
    }
  }
  public double calcChange(){
    return (coin1.getVALUE() * (double) num1) + (coin2.getVALUE() * (double) num2);
  }
}//end of class
