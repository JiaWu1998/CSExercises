public class ArrayOfEmployees{
  private int SETAMOUNTOFEMPLOYEE = 1000;
  private Employee[] arr;
  private int indexOfNext = 0;

  public ArrayOfEmployees(){
    arr = new Employee[SETAMOUNTOFEMPLOYEE];
  }
  public ArrayOfEmployees(int num){
    arr = new Employee[num];
  }
  public ArrayOfEmployees(Employee[] existingArr, int in){
    arr = existingArr;
    indexOfNext = in;
  }
  public void setArray(Employee[] arr2){
    arr = arr2;
  }
  public Employee[] getArray(){
    return arr;
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
  public Employee getEmployeeAt(int num9){
    return arr[num9];
  }
  public void add(Employee employ){
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
  public int isThere(Employee employ1){
    int there = -1;
      for(int k=0; k<indexOfNext; k++){
        if(arr[k].equals(employ1)){
          there = 1;
          break;
        }
      }
    return there;
  }
  public void replaceEmployee(Employee employ2, int pos){
    arr[pos] = employ2;
  }
  public void insertEmployee(Employee employ3, int position){
    for(int f=indexOfNext-1; f>=position; f--){
      if(f != position){
        arr[f] = arr[f-1];
      }else{
        arr[f] = employ3;
      }
    }
  }

}//end of class
