public class Rectangle1{
  //Ian Duke and Jiaxing Wu
  public static double length, width;
  public Rectangle(){
    //default con
    length = 0.0;
    width = 0.0;
  }
  public Rectangle(double leng, double wid){
    length = leng;
    width = wid;
  }
  public void setLength(double lengg){
    length = lengg;
  }
  public void setWidth(double widt){
    width = widt;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public double getArea(){
    return width*length;
  }
  public double getAreaOf(Rectangle rec1){
    return this.width * this.length;
  }
}
