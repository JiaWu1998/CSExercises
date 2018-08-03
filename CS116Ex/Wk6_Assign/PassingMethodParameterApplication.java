public class PassingMethodParameterApplication{
  public static void main(String[] args){
    //Exercise 1
    int[] array1 = {1,2,3,4,5};
    printArr(array1);
    moveUpOne(array1);
    printArr(array1);
    //mission completed ~_~ --> data is changed

    //Exercise 2
    int test = 5;
    System.out.println("Test Num: " + test);
    multiplyByTwo(test);
    System.out.println("Test Num: " + test);
    // the test variable doesn't change cuz there's no assignment after test = 5.
    // the multiplyByTwo only multiply input by 2 and no more is assigned to test
    // the moveUpOne method actually assigns
    // Note when arr[h] = arr[h+1]; and arr[h] = holder; --> there is assigning
  }
  public static void moveUpOne(int[] arr){
    //I am assuming that the data that is lost from moving up go to the back of the array
    int holder = arr[0];
    for(int h=0;h<arr.length;h++){
      if(h != arr.length-1){
        arr[h] = arr[h+1];
      }else{
        arr[h] = holder;
      }
    }
  }
  public static void printArr(int[] arr2){
    for(int z=0; z<arr2.length; z++){
      System.out.print(arr2[z]+" ");
    }
    System.out.println();
  }
  public static void multiplyByTwo(int numm){
    int store = numm * 2;
    System.out.println("Method Num: " + store);
  }
}
