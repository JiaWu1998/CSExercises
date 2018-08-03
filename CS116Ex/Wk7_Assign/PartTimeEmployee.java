public class PartTimeEmployee extends Employee{
  private double hourlyWage;
  private double hoursWorked;

  public PartTimeEmployee(){
    setFirstName("");
    setMiddleName("");
    setLastName("");
    setCompayID("");
    hourlyWage = 0.0;
    hoursWorked = 0.0;
  }
  public PartTimeEmployee(String firs, String last, String mid, String company, double hourWage, double hours){
    setFirstName(firs);
    setMiddleName(mid);
    setLastName(last);
    setCompayID(company);
    hourlyWage = hourWage;
    hoursWorked = hours;
  }
  public void setHourlyWage(double num34){
    hourlyWage = num34;
  }
  public void setHoursWorked(double num43){
    hoursWorked = num43;
  }
  public double getHourlyWage(){
    return hourlyWage;
  }
  public double getHoursWorked(){
    return hoursWorked;
  }

  @Override
  public String toString(){
    return super.toString() + ", HourlyWage: " + hourlyWage + ", HoursWorked: " + hoursWorked;
  }
  public boolean equals(PartTimeEmployee obj2){
    if( ((this.getFirstName()).equals(obj2.getFirstName()))&& ((this.getLastName()).equals(obj2.getLastName())) && ((this.getMiddleName()).equals(obj2.getMiddleName())) && ((this.getCompanyID()).equals(obj2.getCompanyID())) && (this.hourlyWage == obj2.getHourlyWage())
    && (this.hoursWorked == obj2.getHoursWorked())){
      return true;
    }else{
      return false;
    }
  }
  public int compareTo(PartTimeEmployee obj6){
    //order by lastName
    if( ((this.getLastName()).compareTo(obj6.getLastName()) == 0) ){
      return 0;
    }else if( ((this.getLastName()).compareTo(obj6.getLastName()) > 0) ){
      return 1;
    }else{
      return -1;
    }
  }
  public String calcPayroll(){
    double payCheck = hourlyWage * hoursWorked;
    return getFirstName() + " " + getMiddleName() + " " + getLastName() + "," + getCompanyID() + "," + payCheck;
  }
  public double actualPayCheck(){
    double payCheck2 = hourlyWage * hoursWorked;
    return payCheck2;
  }
}// end of class
