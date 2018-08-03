import java.io.IOException;
public class ISBN10 extends ISBN{
  private String isbn10;

  public ISBN10(){
    super();
    isbn10 = "";
  }
  public ISBN10(String isbnn10){
    super(isbnn10);
    if((isbnn10.charAt(9) == 'X')){
      isbnn10 = isbnn10.replace("X","0");
    }
    if((isbnn10.charAt(9) == 'x')){
      isbnn10 = isbnn10.replace("x","0");
    }
    isbn10 = isbnn10;
  }
  public void setISBN10(String isb){
    if((isb.charAt(9) == 'X')){
      isb = isb.replace("X","0");
    }
    if((isb.charAt(9) == 'x')){
      isb = isb.replace("x","0");
    }
    isbn10 = isb;
  }
  public String getISBN10(){
    String isbnReturn = isbn10.replace("0","X");;
    return isbnReturn;
  }
  @Override
  public boolean verifyLength(){
    if(isbn10.length() == 10){
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
      holder = Integer.parseInt(isbn10.substring(0,9));
    }catch(NumberFormatException e){
      numValid = false;
    }
    return numValid;
  }
  @Override
  public String toString(){
    return "ISBN10: " + isbn10;
  }
  @Override
  public int calcCheckSum(){
    int method = 10;
    int sum = 0;
    String[] parts = isbn10.split("");

    for(int b=0; b<parts.length-1; b++){
      sum += method * Integer.parseInt(parts[b]);
      method --;
    }
    sum = (11-(sum%11))%11;
    return sum;
  }
  @Override
  public boolean verifyCheckSum(){
    if(this.calcCheckSum() == Character.getNumericValue(isbn10.charAt(isbn10.length()-1))){
      return true;
    }else{
      return false;
    }
  }

}//end of class
