public class ObjectList{
  // capacity is now dynamic - it is not CAPACITY cause it changes with the trim and morecapacity
  private int capacity = 1000;
  private Object[] arr;
  private int indexOfNext = 0;
  private int pointer = 0;

  public ObjectList(){
    arr = new Object[capacity];
  }
  public ObjectList(int num){
    arr = new Object[num];
  }
  public ObjectList(Object[] existingArr, int in){
    arr = existingArr;
    indexOfNext = in;
  }
  public void setArray(Object[] arr2){
    arr = arr2;
  }
  public Object[] getArray(){
    Object[] arrDeep = new Object[capacity];
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

  public Object getObjectAt(int num9){
    return arr[num9];
  }
  public void add(Object employ){
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

  public int isThere(Object employ1){
    int there = -1;
      for(int k=0; k<indexOfNext; k++){
        if(arr[k].equals(employ1)){
          there = 1;
          break;
        }
      }
    return there;
  }
  public void replaceObject(Object employ2, int pos){
    arr[pos] = employ2;
  }
  public void insertObject(Object employ3, int position){
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
    arr = new Object[capacity];
    indexOfNext = 0;
  }

  public void trim(){
    capacity = indexOfNext;
    Object[] arr2 = new Object[capacity];
    for(int d=0; d<capacity; d++){
      arr2[d] = arr[d];
    }
    arr = arr2;
  }

  public void moreCapacity(){
    //adding in 50% more capacity and rounds down
    //Ex: capacity = 5 --> new capacity 5*1.5 = 7.5 -- round down --> NEW CAPACITY = 7
    capacity = (int) ((double) capacity * 1.5);

    Object[] arr3 = new Object[capacity];
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

  public Object getNext(){
    Object hopper = arr[pointer];
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
