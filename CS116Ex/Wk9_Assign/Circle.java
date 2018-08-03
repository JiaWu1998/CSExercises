public class Circle extends Shape implements Comparable{
  private double PI = 3.14;
  private int radius;
  public Circle(){
    radius = 0;
  }
  public Circle(int rad){
    radius = rad;
  }
  public void setRadius(int radi){
    radius = radi;
  }
  public int getRadius(){
    return radius;
  }
  public double calcArea(){
    return PI * (double) radius * (double) radius;
  }
  public double calcPerimeter(){
    return 2.0 * PI * (double) radius;
  }
  public boolean equals(Circle cir1){
    if(this.radius == cir1.getRadius()){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return "radius: " + radius;
  }
  public int compareTo(Object cir2){
    if(cir2 instanceof Circle){
      Circle cir3 = (Circle) cir2;
      if(this.radius == cir3.getRadius()){
        return 0;
      }else if(this.radius > cir3.getRadius()){
        return 1;
      }else{
        return -1;
      }
    }
    else{
      return 0;
    }
  }
}
