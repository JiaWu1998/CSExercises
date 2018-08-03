public class BrandFavoriteIceCream extends FavoriteIceCream{
  private String brand;
  public BrandFavoriteIceCream(){
    super();
    brand = "";
  }
  public BrandFavoriteIceCream(String falvv,String bra){
    super();
    this.setFlavor(falvv);
    brand = bra;
  }
  public void setBrand(String bran){
    brand = bran;
  }
  public String getBrand(){
    return brand;
  }
  @Override
  public String toString(){
    return super.toString() + ", Brand: " + brand;
  }
  public boolean equals(BrandFavoriteIceCream ite2){
    if(((this.getFlavor()).compareTo(ite2.getFlavor()) == 0)&&((this.brand).compareTo(ite2.getBrand()) == 0)){
      return true;
    }else{
      return false;
    }
  }
}// end of class
