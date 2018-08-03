public class selection{
  public static void main(String[] args){
    int[] arr = {4,2,5,6,7,1,8};

    for(int i=0;i<arr.length;i++){
      for(int j=i; j<arr.length;j++){
        if(arr[i]>arr[j]){
          int holder = arr[i];
          arr[i] = arr[j];
          arr[j] = holder;
        }
      }
    }

    for(int h=0; h<arr.length;h++){
      System.out.print(arr[h] + ", ");
    }
  }//end main
}
