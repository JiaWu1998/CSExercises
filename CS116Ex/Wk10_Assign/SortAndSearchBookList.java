public class SortAndSearchBookList extends BookList{
  public SortAndSearchBookList(){
    super();
  }
  public SortAndSearchBookList(int num){
    super(num);
  }
  public int sequentialSearch(Book findThis){
    int n = 0;
    int bookIndex = -1;
    Book[] array2 = super.getArray();
    for(int i=0; i<array2.length; i++){
      if((array2[i].getAuthor()).equals(findThis.getAuthor())&&(array2[i].getTitle()).equals(findThis.getTitle())){
        bookIndex = i;
        System.out.println("sequentialSearch: n = " + n);
        return bookIndex;
      }
      n++;
    }
    System.out.println("sequentialSearch: n = " + n);
    return bookIndex;
  }
  public int sequentialSearchRecursive(Book findThis2, int first2, int last2, int count2){
    String searchKey = findThis2.getAuthor();
      if(first2>last2){
        System.out.println("sequentialSearchRecursive: n = " + count2);
        return -1;
      }
      if(searchKey.compareTo(super.getBookAt(first2).getAuthor()) == 0){
        System.out.println("sequentialSearchRecursive: n = " + count2);
        return first2;
      }
      return sequentialSearchRecursive(findThis2, first2+1, last2, count2+1);
  }
  public int binarySearch(Book thisBook){
    selectSort();
    int n = 0;
    String searchKey = thisBook.getAuthor();
    int start = 0;
    int end = super.getArray().length;

    while(start<=end){
      int mid = (int)((start+end)/2.0);
      if(searchKey.compareTo(super.getBookAt(mid).getAuthor()) < 0){
        n++;
        end = mid-1;
      }else if(searchKey.compareTo(super.getBookAt(mid).getAuthor()) > 0){
        n++;
        start = mid+1;
      }else{
        n++;
        System.out.println("binarySearch: n = " + n);
        return mid;
      }
    }
    System.out.println("binarySearch: n = " + n);
    return -1;
  }
  public int binarySearchRecursive(Book thisBook2,int first, int last,int counts){
    // the last is the last index
    //int searchKey,int[] array,int start, int end
    selectSort();
    String searchKey = thisBook2.getAuthor();
    int start = first;
    int end = last;
    int mid = (int)((start + end)/2.0);

      if(start<=end){
        if(searchKey.compareTo(super.getBookAt(mid).getAuthor()) < 0){
          mid = binarySearchRecursive(thisBook2,start,mid-1,counts+1);
        }else if(searchKey.compareTo(super.getBookAt(mid).getAuthor()) > 0){
          mid = binarySearchRecursive(thisBook2,mid+1,end,counts+1);
        }else if (searchKey.compareTo(super.getBookAt(mid).getAuthor()) == 0){
          System.out.println("binarySearchRecursive: n = " + counts);
          return mid;
        }
      }
      System.out.println("binarySearchRecursive: n = " + counts);
      return mid;
  }
  public void selectSort(){
    //assuming that the sorting is the prep to binarySearch
    //You wanted the binarySearch to be by author
    //Therefore, the sort should be by author too
    int n = 0;
    Book[] sortedArr = super.getArray();
    for(int h=0; h<sortedArr.length;h++){
      for(int b=h; b<sortedArr.length;b++){
         if((sortedArr[h].getAuthor()).compareTo(sortedArr[b].getAuthor()) > 0){
          Book hold = sortedArr[b];
          sortedArr[b] = sortedArr[h];
          sortedArr[h] = hold;
          n++;
        }
      }
    }
    super.setArray(sortedArr);
    System.out.println("SelectionSort: n = " + n);
  }
}//end of class
