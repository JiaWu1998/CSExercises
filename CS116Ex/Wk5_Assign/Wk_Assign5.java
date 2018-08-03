import java.util.Scanner;
import java.io.*;

public class Wk_Assign5{
  public static void main(String[] args) throws IOException{
    File txtFile = new File("pswds2.txt");
    Scanner read = new Scanner(txtFile);
    VendorList vendors = new VendorList();
    String[] tokenSplit;
    int notFirst = 0;

    while(read.hasNextLine()){
      if(notFirst != 0){
        tokenSplit = (read.nextLine()).split(",");
        vendors.add(new Vendor2(tokenSplit[0],tokenSplit[1],tokenSplit[2],tokenSplit[3]));
      }else{
        String waste = read.nextLine();
      }
      notFirst++;
    }
    read.close();

    System.out.println(vendors);
    System.out.println(vendors.getVendorAt(3));
    System.out.println("The index of the vendor above is " + vendors.isThere(vendors.getVendorAt(3)));
    System.out.println("There are "+vendors.getIndex()+" vendors.");
    if(vendors.isThere(vendors.getVendorAt(3))>0){
      vendors.delete(3);
    }
    System.out.println("Vendor in index 3 is now(after deletetion if it exists): " + vendors.getVendorAt(3));
    System.out.println("There are "+vendors.getIndex()+" vendors.");
    vendors.insertVendor(new Vendor2("a","d","c","b"),3);
    System.out.println("Vendor in index 3 is now(after insertion): " + vendors.getVendorAt(3));
    System.out.println("There are "+vendors.getIndex()+" vendors.");
    //swaping commence
    Vendor2 firstVendor = vendors.getVendorAt(0);
    Vendor2 lastVendor = vendors.getVendorAt(49);
    System.out.println("The first vendor is : " + firstVendor);
    System.out.println("The last vendor is : " + lastVendor);
    vendors.delete(0);
    vendors.insertVendor(lastVendor,0);
    vendors.delete(49);
    vendors.insertVendor(firstVendor,49);
    System.out.println("The first vendor is now: " + vendors.getVendorAt(0));
    System.out.println("The last vendor is now: " + vendors.getVendorAt(49));

    FileOutputStream results;
    try{
       results = new FileOutputStream("results.txt");
    }catch(FileNotFoundException e){
       results = new FileOutputStream("results.txt",false);
    }
    PrintWriter write = new PrintWriter(results);

    for(int i=0; i<vendors.getIndex();i++){
      write.println(vendors.getVendorAt(i));
    }
    write.flush();
    write.close();
  }//end main
}//end app
