public abstract class Employee{
  private String firstName;
  private String middleName;
  private String lastName;
  private String companyId;

  public void setFirstName(String text1){
    firstName = text1;
  }
  public void setMiddleName(String text2){
    middleName = text2;
  }
  public void setLastName(String text3){
    lastName = text3;
  }
  public void setCompayID(String text4){
    companyId = text4;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getMiddleName(){
    return middleName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getCompanyID(){
    return companyId;
  }
  public String toString(){
    return "First: " + firstName + ", Middle: " + middleName + ", Last: " + lastName + ", CompanyID: " + companyId ;
  }

  public abstract String calcPayroll();

  public abstract double actualPayCheck();
}// end of class
