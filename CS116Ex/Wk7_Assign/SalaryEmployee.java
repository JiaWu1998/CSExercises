public class SalaryEmployee extends Employee{
  private double paidSalary;
  public SalaryEmployee(){
    setFirstName("");
    setMiddleName("");
    setLastName("");
    setCompayID("");
    paidSalary = 0.0;
  }
  public SalaryEmployee(String first, String las, String midd, String compan, double pay){
    setFirstName(first);
    setMiddleName(midd);
    setLastName(las);
    setCompayID(compan);
    paidSalary = pay;
  }
  public void setpaidSalary(double payC){
    paidSalary = payC;
  }
  public double getpaidSalary(){
    return paidSalary;
  }
  @Override
  public String toString(){
    return super.toString() + ", paidSalary: " + paidSalary;
  }
  public boolean equals(SalaryEmployee salaryGuy){
    if( ((this.getFirstName()).equals(salaryGuy.getFirstName()))&& ((this.getLastName()).equals(salaryGuy.getLastName())) && ((this.getMiddleName()).equals(salaryGuy.getMiddleName())) && ((this.getCompanyID()).equals(salaryGuy.getCompanyID())) && (this.paidSalary == salaryGuy.getpaidSalary())){
      return true;
    }else{
      return false;
    }
  }
  public int compareTo(SalaryEmployee salaryGuy2){
    //order by lastName
    if( ((this.getLastName()).compareTo(salaryGuy2.getLastName()) == 0) ){
      return 0;
    }else if( ((this.getLastName()).compareTo(salaryGuy2.getLastName()) > 0) ){
      return 1;
    }else{
      return -1;
    }
  }
  public String calcPayroll(){
    return getFirstName() + " " + getMiddleName() + " " + getLastName() + "," + getCompanyID() + "," + paidSalary;
  }
  public double actualPayCheck(){
    return paidSalary;
  }
}// end of class
