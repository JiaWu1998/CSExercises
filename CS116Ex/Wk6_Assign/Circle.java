public class Circle{
  private double radius;
  private double area;
  private double circum;
  private double PI = 3.14;

  public Circle(){
    radius = 0.0;
    area = 0.0;
    circum = 0.0;
  }
  public Circle(double rad){
    radius = rad;
    area = PI*rad*rad;
    circum = PI*2.0*rad;
  }
  public void setRadius(double rad1){
    radius = rad1;
    area = PI*rad1*rad1;
    circum = PI*2.0*rad1;
  }
  public double getRadius(){
    return radius;
  }
  public double calcArea(){
    return area;
  }
  public double calcCircumference(){
    return circum;
  }
  public String toString(){
    return "radius: " + radius + ", area: " + area + ", Circumference: " + circum;
  }
  public boolean equals(Circle newCir){
    if((this.radius == newCir.getRadius())&&(this.area == newCir.calcArea())&&(this.circum == newCir.calcCircumference())){
      return true;
    }else{
      return false;
    }
  }
  public int compareTo(Circle newCir1){
    if(this.radius == newCir1.getRadius()){
      return 0;
    }else if(this.radius > newCir1.getRadius()){
      return 1;
    }else{
      return -1;
    }
  }
}// end of class
