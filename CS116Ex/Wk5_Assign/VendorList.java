public class VendorList{
  private int SIZE;
  private Vendor2[] array;
  private int index;

  public VendorList(){
    SIZE = 1000; //max vendors of 1000 -> it could be increased.
    array = new Vendor2[SIZE];
    index = 0;
  }
  public VendorList(int slot){
    SIZE = slot;
    array = new Vendor2[SIZE];
    index = 0;
  }
  public VendorList(Vendor2[] anArr, int newIndex){
    array = anArr;
    index = newIndex;
  }
  public void setVendorArray(Vendor2[] arr3){
    array = arr3;
  }
  public Vendor2[] getVendorArray(){
    return array;
  }
  public void setIndex(int inn2){
    index = inn2;
  }
  public int getIndex(){
    return index;
  }
  public Vendor2 getVendorAt(int indexx){
    return array[indexx];
  }
  public String toString(){
    String big = "";
    for(int i=0; i<index; i++){
      big += (array[i] + "\n");
    }
    return big;
  }
  public void add(Vendor2 ven){
    array[index] = ven;
    index++;
  }
  public int isThere(Vendor2 ven2){
    int there = -1;
    for(int i=0;i<index;i++){
      there = (array[i] == ven2) ? i : -1;
      if(there == i){
        break;
      }
    }
    return there;
  }
  //this is assuming that pos is the index from user
  public void insertVendor(Vendor2 ven3, int pos){
    if(pos < index){
      for(int h=index+1; h>=pos; h--){
        if(h != pos){
          array[h] = array[h-1];
        }else{
          array[h] = ven3;
        }
      }
      index++;
    }else{
      array[index] = ven3;
      index++;
    }
  }
  //saids set but it really means replace
  public void setVendor(Vendor2 ven4, int pos2){
    array[pos2] = ven4;
  }
  public void delete(int delIndex){
    if(index != 0){
      for(int d=delIndex; d<index;d++){
        array[d] = array[d+1];
      }
      index--;
    }
  }
} //end class
