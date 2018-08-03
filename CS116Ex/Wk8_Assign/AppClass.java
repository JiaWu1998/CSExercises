public class AppClass{
  public static void main(String[] args){
    ObjectList list = new ObjectList();
    list.add(new Rectangle2(3,4));
    list.add(new Rectangle2(5,6));
    list.add(new Rectangle2(2,12));
    list.add(new Rectangle2(9,7));

    System.out.println(list.getNext());
    list.reset();
    System.out.println(list.getNext() + "\n");
    //reset() passed

    System.out.println(list.hasNext() + "\n");
    //hasNext() passed; pointer was on 1

    System.out.println(list.getNext() + "\n");
    //getNext() passed; 2nd Object returned

    list.reset();
    for(Object x: new Object[list.getindexOfNext()]){
      System.out.println(list.getNext());
    }
    //Repeat getNext() passed

    System.out.println("\n" + "Full: " + list.isFull() + "\n");
    //isFull() passed

    //the index is substracted one cause it's the index of next --- we are trying to get index of current
    //***One problem with the trim() test plan results --->  expected result: index = length-1 after trim()
    //The current index shouldn't change with trim() cause you are not deleteing any existing object so the current index stays
    //The only thing changing in trim() should be the "length" or the Capacity of the arraylist because the main mechanics of trim()
    //is to "remove excess capacity so that capacity matches size(num of objects currently in the arraylist)"
    System.out.println("index: " + (list.getindexOfNext()-1));
    System.out.println("Capacity: " + list.getCapacity());
    list.trim();
    System.out.println("index: " + (list.getindexOfNext()-1));
    System.out.println("Capacity: " + list.getCapacity());
    //trim() passed

    System.out.println("\nFull: " + list.isFull() + "\n");
    //isFull() after trim passed

    System.out.println("Capacity: " + list.getCapacity());
    list.moreCapacity();
    System.out.println("Capacity: " + list.getCapacity());

    System.out.println("\nEmpty: " + list.isEmpty());
    list.clear();
    //***Important problem with this result of clear() = 0 on the test plan
    // if clear(), current index should equal to null because there wouldn't be a object or index to begin with
    //object 1 is at index 0
    //object 0 should have index null or index -1; not index 0 unless you dont want INDEX OF CURRENT object but index of the NEXT object
    System.out.println("Index: " + list.getindexOfNext());
    System.out.println("Empty: " + list.isEmpty());
    //clear() and isEmpty() passed

    //There was only two problems, the clear() test plan, which I returned 0 like the expected result, and the trim() test plan.
    //The problem for both test plans is not that I can't get the certain expected result, but it is the
    //confusion that I have in regards of the correctness of the expected results.

  }
}
