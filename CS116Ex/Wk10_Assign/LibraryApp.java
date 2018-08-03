import java.util.Scanner;
import java.io.*;
public class LibraryApp{
  public static void main(String[] args) throws IOException{
    SortAndSearchBookList libraryBooks = new SortAndSearchBookList();
    File file;
    Scanner read;
    FileOutputStream exercise2;
    PrintWriter write;

    try{
      file = new File("bks13b.txt");
      read = new Scanner(file);

      while(read.hasNextLine()){
        String[] token = (read.nextLine()).split(",");

        ISBN numIs = (token[2].length() == 10) ? new ISBN10(token[2]) : new ISBN13(token[2]); ;
        Double price = Double.parseDouble(token[5]);
        int numOfBooks = Integer.parseInt(token[6]);

        libraryBooks.add(new Book(token[0],token[1],numIs,token[3],token[4],price,numOfBooks));
      }
      read.close();
    }catch(FileNotFoundException e){
      System.out.println("bks13b.txt is not founded");
    }

    try{
      exercise2 = new FileOutputStream("Exercise2.txt");
      write = new PrintWriter(exercise2);
    }catch(FileNotFoundException e){
      exercise2 = new FileOutputStream("Exercise2.txt",true);
      write = new PrintWriter(exercise2);
    }

    while(libraryBooks.hasNext()){
      Book booklet = libraryBooks.getNext();
      //System.out.println(booklet.getISBN().getClass() + ", Title: " + booklet.getTitle() + ", " +booklet.getISBN() + ", CheckSum Validity: " + booklet.getISBN().verifyCheckSum());
      write.println(booklet.getISBN().getClass() + ", Title: " + booklet.getTitle() + ", " +booklet.getISBN() + ", CheckSum Validity: " + booklet.getISBN().verifyCheckSum());
    }
    write.flush();
    exercise2.close();

    //show off sorted List
    //System.out.println("\nAuthors OF SortAndSearchBookList:");
    libraryBooks.reset();

    //Testing sort here
    libraryBooks.selectSort();
    while(libraryBooks.hasNext()){
      Book books2 = libraryBooks.getNext();
      System.out.println(books2.getAuthor());
    }

    //Testing equals of book class (Both test passed)
    System.out.println((libraryBooks.getBookAt(0)).equals(libraryBooks.getBookAt(0)));
    System.out.println((libraryBooks.getBookAt(0)).equals(libraryBooks.getBookAt(1)));

    //Testing compareTo of book class (All test passed)
    System.out.println((libraryBooks.getBookAt(0)).compareTo(libraryBooks.getBookAt(1)));
    System.out.println((libraryBooks.getBookAt(1)).compareTo(libraryBooks.getBookAt(0)));
    System.out.println((libraryBooks.getBookAt(0)).compareTo(libraryBooks.getBookAt(0)));

    //Testing subclass constructors -passed
    SortAndSearchBookList defaultList = new SortAndSearchBookList();
    System.out.println(defaultList.getCapacity());
    System.out.println(libraryBooks.getCapacity());

    //Testing sequentialSearch Passed
    System.out.println(libraryBooks.sequentialSearch(libraryBooks.getBookAt(7)));
    System.out.println(libraryBooks.sequentialSearch(libraryBooks.getBookAt(8)));
    System.out.println(libraryBooks.sequentialSearch(new Book()));

    //Testing binarySearch
    System.out.println(libraryBooks.binarySearch(libraryBooks.getBookAt(7)));
    System.out.println(libraryBooks.binarySearch(libraryBooks.getBookAt(8)));
    System.out.println(libraryBooks.binarySearch(new Book()));

    //Recursive Section
    System.out.println("Recursive Section:");
    System.out.println(libraryBooks.binarySearchRecursive(libraryBooks.getBookAt(7),0,libraryBooks.getArray().length-1,0));
    System.out.println(libraryBooks.binarySearchRecursive(libraryBooks.getBookAt(8),0,libraryBooks.getArray().length-1,0));
    System.out.println(libraryBooks.binarySearchRecursive(new Book(),0,libraryBooks.getArray().length-1,0));
    System.out.println(libraryBooks.sequentialSearchRecursive(libraryBooks.getBookAt(7),0,libraryBooks.getArray().length-1,0));
    System.out.println(libraryBooks.sequentialSearchRecursive(libraryBooks.getBookAt(8),0,libraryBooks.getArray().length-1,0));
    System.out.println(libraryBooks.sequentialSearchRecursive(new Book(),0,libraryBooks.getArray().length-1,0));



  }
}//end of class
