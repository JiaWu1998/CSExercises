public class FavoriteIceCream{
  private String flavor;
  public FavoriteIceCream(){
    flavor = "";
  }
  public FavoriteIceCream(String fla){
    flavor = fla;
  }
  public void setFlavor(String flav){
    flavor = flav;
  }
  public String getFlavor(){
    return flavor;
  }
  public String toString(){
    return "Flavor: " + flavor;
  }
  public boolean equals(FavoriteIceCream item2){
    if((this.flavor).compareTo(item2.getFlavor())== 0){
      return true;
    }else{
      return false;
    }
  }
  public int compareTo(FavoriteIceCream item3){
    if((this.flavor).compareTo(item3.getFlavor())== 0){
      return 0;
    }else if((this.flavor).compareTo(item3.getFlavor()) > 0){
      return 1;
    }else{
      return -1;
    }
  }
}// end of class
