import java.util.Scanner;
import java.io.*;

public class CompanyApp{
  public static void main(String[] args) throws IOException{
    double sum = 0;
    ArrayOfEmployees listOfEmployee = new ArrayOfEmployees();

    try{
      FileInputStream file = new FileInputStream("employees.txt");
      Scanner read = new Scanner(file);

      while(read.hasNextLine()){
          String holder = read.nextLine();
          int comma = 0;

          for(int d=0; d<holder.length(); d++){
            if(holder.charAt(d) == ','){
              comma++;
            }
          }
          String[] breakDown = holder.split(",");
          if(comma == 5){
            //parttime
            listOfEmployee.add(new PartTimeEmployee(breakDown[0],breakDown[1],breakDown[2],breakDown[3],Double.parseDouble(breakDown[4]),Double.parseDouble(breakDown[5])));
          }else{
            //salary
            listOfEmployee.add(new SalaryEmployee(breakDown[0],breakDown[1],breakDown[2],breakDown[3],Double.parseDouble(breakDown[4])));
          }
      }

      read.close();

      FileOutputStream fileOut;
      PrintWriter write;
      try{
        fileOut = new FileOutputStream("PayRollInfo.txt");
        write = new PrintWriter(fileOut);
      }catch(FileNotFoundException f){
        fileOut = new FileOutputStream("PayRollInfo.txt",false);
        write = new PrintWriter(fileOut);
      }

      //write things here
      for(int q=0; q<listOfEmployee.getindexOfNext();q++){
        Employee sample = listOfEmployee.getEmployeeAt(q);
        write.println(sample.calcPayroll());
      }

      write.flush();
      fileOut.close();

    }catch(FileNotFoundException e){
      System.out.println("employees.txt is not found.");
    }

    //Finale:
    for(int b=0; b<listOfEmployee.getindexOfNext();b++){
      Employee employeeDecoy = listOfEmployee.getEmployeeAt(b);
      System.out.println(employeeDecoy);
      sum += employeeDecoy.actualPayCheck();
    }
    System.out.println("Total Salary in this Pay Period: " + sum);
  }
}// end of class
