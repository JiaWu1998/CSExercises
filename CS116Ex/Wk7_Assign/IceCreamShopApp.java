public class IceCreamShopApp{
  public static void main(String[] args){
    FavoriteIceCream[] arr = new FavoriteIceCream[10];
    arr[0] = new FavoriteIceCream("strawberry");
    arr[1] = new FavoriteIceCream("Chocolate");
    arr[2] = new FavoriteIceCream("Vallia");
    arr[3] = new FavoriteIceCream("berry");
    arr[4] = new FavoriteIceCream("dunkey");
    arr[5] = new BrandFavoriteIceCream("fur","Mane");
    arr[6] = new BrandFavoriteIceCream("house","Sum");
    arr[7] = new BrandFavoriteIceCream("two","Fun");
    arr[8] = new BrandFavoriteIceCream("bounce","Ick");
    arr[9] = new BrandFavoriteIceCream("cake","mon");

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
    //Yes, polymor is shown cause the terminal was able to determine which toString to run.
  }
}
