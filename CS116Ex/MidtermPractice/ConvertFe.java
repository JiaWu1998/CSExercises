public class ConvertFe{
  private double tempF;
  private double tempC;
  public ConvertFe(){
    tempF = 32.0;
    tempC = (tempF - 32.0)/1.8;
  }
  public ConvertFe(double tempFe){
    tempF = tempFe;
    tempC = (tempF - 32.0)/1.8;
  }
  public void setTempF(double tempFen){
    tempF = tempFen;
    tempC = (tempF - 32.0)/1.8;
  }
  public double getTempF(){
    return tempF;
  }
  public double getTempC(){
    return tempC;
  }
  public String toString(){
    return "Fahrenheit: " + tempF + ", Celsius: " + tempC;
  }
  public int compareTo(ConvertFe obj1){
    if(this.tempF > obj1.getTempF()){
      return 1;
    }else if(this.tempF == obj1.getTempF()){
      return 0;
    }else{
      return -1;
    }
  }
  public boolean equals(ConvertFe obj2){
    if((this.tempC == obj2.getTempC())&&(this.tempF == obj2.getTempF())){
      return true;
    }else{
      return false;
    }
  }
  public static double convertToCeClass(double temppF){
    return (temppF - 32.0)/1.8;
  }
  public double convertToCeInstance(double temppFI){
    return (temppFI - 32.0)/1.8;
  }
}
