import java.io.IOException;
public class ISBN{
  private String ISBNCHANGES = "978";
  private String isbn;
  public ISBN(){
    isbn = "";
  }
  public ISBN(String isb){
    if(isb.length() == 10){
      if((isb.charAt(9) == 'X')){
        isb = isb.replace("X","0");
      }
      if((isb.charAt(9) == 'x')){
        isb = isb.replace("x","0");
      }
      isbn = ISBNCHANGES + isb;
    }else{
      isbn = isb;
    }
  }
  public void setISBN(String is){
    if(is.length() == 10){
      if((is.charAt(9) == 'X')){
        is = is.replace("X","0");
      }
      if((is.charAt(9) == 'x')){
        is = is.replace("x","0");
      }
      isbn = ISBNCHANGES + is;
    }else{
      isbn = is;
    }
  }
  public String getISBN(){
    String copy = isbn;
    return copy;
  }
  public boolean verifyLength(){
    if(isbn.length() == 13){
      return true;
    }else{
      return false;
    }
  }
  public boolean verifyDigit() throws IOException{
    boolean numValid = true;
    int holder;
    try{
      holder = Integer.parseInt(isbn.substring(0,12));
    }catch(NumberFormatException e){
      numValid = false;
    }
    return numValid;
  }
  public String toString(){
    return "ISBN: " + isbn;
  }
  public int calcCheckSum(){
    int sum = 0;
    String[] parts = isbn.split("");

    for(int i=0; i<parts.length-1; i++){
      if(i%2 != 0){
        sum += Integer.parseInt(parts[i]);
      }else{
        sum += 3 * Integer.parseInt(parts[i]);
      }
    }
    sum %= 10;
    sum = 10 - sum;
    return sum;
  }
  public boolean verifyCheckSum(){
    if(calcCheckSum() == Character.getNumericValue(isbn.charAt(isbn.length()-1))){
      return true;
    }else{
      return false;
    }
  }

}//end of class
