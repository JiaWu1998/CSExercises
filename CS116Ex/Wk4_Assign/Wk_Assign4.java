import java.util.Scanner;
import java.io.*;

public class Wk_Assign4{
  public static void main(String[] args) throws IOException{
    //sample user defined objects
    Vendor sample = new Vendor();
    //sample user defined objects

    int count = 0; //number of vendors needed (-1 cause first one is for display)
    FileInputStream file = new FileInputStream("pswds.txt");
    Scanner read = new Scanner(file);

    while(read.hasNextLine()){
      String exhast = read.nextLine();
      count++;
    }
    System.out.println((count-1) + " items");
    read.close();

    //could have used file1 instead of file2
    FileInputStream file2 = new FileInputStream("pswds.txt");
    Scanner read2 = new Scanner(file2);
    String[] allString = new String[count];
    Vendor[] allSys = new Vendor[count];
    int count2 = 0;
    while(read2.hasNextLine()){
      allString[count2] = read2.nextLine();
      count2 ++;
    }

    for(int i=1; i<allString.length;i++){
      String[] allInfoSys = new String[4];
      allInfoSys = allString[i].split(",");
      allSys[i-1] = new Vendor(allInfoSys[0],allInfoSys[1],allInfoSys[2],allInfoSys[3]);
    }
    for(int i=0; i<allString.length-1;i++){
      System.out.println(allSys[i]);
    }

    try{
      FileOutputStream newFile = new FileOutputStream("result.txt");
      PrintWriter write = new PrintWriter(newFile);
        for(int i=0; i<allString.length-1;i++){
          write.println(allSys[i]);
        }
      write.flush();
      newFile.close();
    }catch(FileNotFoundException e){
      FileOutputStream newFile = new FileOutputStream("result.txt",false);
      PrintWriter write = new PrintWriter(newFile);
        for(int i=0; i<allString.length-1;i++){
          write.println(allSys[i]);
        }
      write.flush();
      newFile.close();
    };
  }//end main
}//end app
