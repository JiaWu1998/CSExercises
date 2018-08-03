import java.io.IOException;
public class ISBN13 extends ISBN{
  private String isbn13;

  public ISBN13(){
    isbn13 = "";
  }
  public ISBN13(String isbnn13){
    super(isbnn13.substring(0,12));
    isbn13 = isbnn13;
  }
  public void setISBN13(String isb){
    isbn13 = isb;
  }
  public String getISBN13(){
    String copy = isbn13;
    return copy;
  }
  @Override
  public boolean verifyLength(){
    if(isbn13.length() == 13){
      return true;
    }else{
      return false;
    }
  }
  @Override
  public boolean verifyDigit() throws IOException{
    boolean numValid = true;
    int holder;
    try{
      holder = Integer.parseInt(isbn13.substring(0,12));
    }catch(NumberFormatException e){
      numValid = false;
    }
    return numValid;
  }
  @Override
  public String toString(){
    return "ISBN13: " + isbn13;
  }
  @Override
  public int calcCheckSum(){
    int sum = 0;
    String[] parts = isbn13.split("");

    for(int i=0; i<parts.length-1; i++){
      if(i%2 != 0){
        sum += 3 * Integer.parseInt(parts[i]);
      }else{
        sum += Integer.parseInt(parts[i]);
      }
    }
    sum = sum % 10;
    sum = (sum != 0) ? 10 - sum : 0 ;
    return sum;
  }
  @Override
  public boolean verifyCheckSum(){
    if(this.calcCheckSum() == Character.getNumericValue(isbn13.charAt(isbn13.length()-1))){
      return true;
    }else{
      return false;
    }
  }

}//end of class
