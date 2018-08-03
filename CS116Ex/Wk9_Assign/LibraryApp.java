import java.util.Scanner;
import java.io.*;
public class LibraryApp{
  public static void main(String[] args) throws IOException{
    BookList libraryBooks = new BookList();

    try{
      File file = new File("bks13b.txt");
      Scanner read = new Scanner(file);

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

    while(libraryBooks.hasNext()){
      Book booklet = libraryBooks.getNext();
      System.out.println(booklet.getISBN().getClass() + ", Title: " + booklet.getTitle() + ", " +booklet.getISBN() + ", CheckSum Validity: " + booklet.getISBN().verifyCheckSum());
    }
    //show off content of array
    System.out.println("\nCONTENTS OF BOOKLIST:");
    libraryBooks.reset();
    while(libraryBooks.hasNext()){
      Book books2 = libraryBooks.getNext();
      System.out.println(books2);
    }
  }
}//end of class
