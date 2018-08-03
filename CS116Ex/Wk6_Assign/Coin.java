import java.lang.Math;
public class Coin{
  //for the methods, I chose to return values instead of sys.out.pnt cause you probably need to save that data later for an interface, not a terminal> cause no user is going to read straight up boring data.
  private String NAME ;
  private double VALUE;
  private String faceValue;
  public Coin(){
    //default
    NAME = "";
    VALUE = 0;
  }
  public Coin(String nam, double val ){
    NAME = nam;
    VALUE = val;
  }
  public double getVALUE(){
    return VALUE;
  }
  public String getNAME(){
    return NAME;
  }
  public void setVALUE(double val){
    VALUE = val;
  }
  public void setNAME(String nam){
    NAME = nam;
  }
  public String toss(){
    faceValue = (Math.random() > 0.5) ? "Heads" : "Tails";
    return faceValue;
  }
  public double sumWith(Coin coinA){
    return Math.round(100 * (this.VALUE + coinA.VALUE)) / 100.0;
  }
  public double sumTwo(Coin coin1, Coin coin2){
    return Math.round(100 * (coin1.VALUE + coin2.VALUE )) /100.0;
  }
  public double times(int multipier ){
    return Math.round(100 * (this.VALUE * multipier )) /100.0;
  }
  public double timesCoin(Coin coinB, int multipy){
    return Math.round(100 * (coinB.VALUE * multipy )) /100.0;
  }
  public boolean equals(Coin coinCopy){
    if(this.NAME.equals(coinCopy.getNAME())&&(this.VALUE == coinCopy.getVALUE())){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return "Coin: " + NAME + ",Value: " + VALUE;
  }
}
