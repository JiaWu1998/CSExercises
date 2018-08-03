public class BookList{
  // capacity is now dynamic - it is not CAPACITY cause it changes with the trim and morecapacity
  private int capacity = 1000;
  private Book[] arr;
  private int indexOfNext = 0;
  private int pointer = 0;

  public BookList(){
    arr = new Book[capacity];
  }
  public BookList(int num){
    arr = new Book[num];
  }
  public BookList(Book[] existingArr, int in){
    arr = existingArr;
    indexOfNext = in;
  }
  public void setArray(Book[] arr2){
    arr = arr2;
  }
  public Book[] getArray(){
    Book[] arrDeep = new Book[capacity];
    for(int x=0; x<arr.length;x++){
      arrDeep[x] = arr[x];
    }
    return arrDeep;
  }

  public void setindexOfNext(int ind){
    indexOfNext = ind;
  }
  public int getindexOfNext(){
    return indexOfNext;
  }
  public String toString(){
    String list = "";
    for(int i=0; i<indexOfNext; i++){
      list += (arr[i] + "\n");
    }
    return list;
  }

  public Book getBookAt(int num9){
    return arr[num9];
  }
  public void add(Book employ){
    arr[indexOfNext] = employ;
    indexOfNext++;
  }
  public void delete(int deletingNum){
    // check for empty arrr
    if(indexOfNext != 0){
      for(int g=deletingNum;g<indexOfNext;g++){
        if(g != indexOfNext-1){
          arr[g] = arr[g+1];
        }else{
          arr[g] = null;
        }
      }
    }
  }

  public int isThere(Book employ1){
    int there = -1;
      for(int k=0; k<indexOfNext; k++){
        if(arr[k].equals(employ1)){
          there = 1;
          break;
        }
      }
    return there;
  }
  public void replaceBook(Book employ2, int pos){
    arr[pos] = employ2;
  }
  public void insertBook(Book employ3, int position){
    for(int f=indexOfNext-1; f>=position; f--){
      if(f != position){
        arr[f] = arr[f-1];
      }else{
        arr[f] = employ3;
      }
    }
  }

  public boolean isFull(){
    if(indexOfNext == capacity){
      return true;
    }else{
      return false;
    }
  }

  public boolean isEmpty(){
    if(indexOfNext == 0){
      return true;
    }else{
      return false;
    }
  }

  public void clear(){
    arr = new Book[capacity];
    indexOfNext = 0;
  }

  public void trim(){
    capacity = indexOfNext;
    Book[] arr2 = new Book[capacity];
    for(int d=0; d<capacity; d++){
      arr2[d] = arr[d];
    }
    arr = arr2;
  }

  public void moreCapacity(){
    //adding in 50% more capacity and rounds down
    //Ex: capacity = 5 --> new capacity 5*1.5 = 7.5 -- round down --> NEW CAPACITY = 7
    capacity = (int) ((double) capacity * 1.5);

    Book[] arr3 = new Book[capacity];
    for(int b=0; b<arr.length; b++){
      arr3[b] = arr[b];
    }
    arr = arr3;
  }

  public void reset(){
    pointer = 0;
  }

  public boolean hasNext(){
    if(pointer < indexOfNext){
      return true;
    }else{
      return false;
    }
  }

  public Book getNext(){
    Book hopper = arr[pointer];
    pointer++;
    return hopper;
  }

  public int getCapacity(){
    return capacity;
  }
  public void setCapacity(int num22){
    capacity = num22;
  }

}//end of class
