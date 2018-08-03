import java.lang.Math;
public class RightTriangle extends Shape implements Comparable{
  private int base;
  private int height;
  public RightTriangle(){
    base = 0;
    height = 0;
  }
  public RightTriangle(int bas, int hei){
    base = bas;
    height = hei;
  }
  public void setBase(int basse){
    base = basse;
  }
  public void setHeight(int heig){
    height = heig;
  }
  public int getBase(){
    return base;
  }
  public int getHeight(){
    return height;
  }
  public double calcArea(){
    return 0.5 * (double) height * (double) base;
  }
  public double calcPerimeter(){
    return (double) height + (double) base + (Math.sqrt((double) ((height*height) + (base*base))));
  }
  public boolean equals(RightTriangle tri1){
    if((this.base == tri1.getBase())&&(this.height == tri1.getHeight())){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return "base: " + base + ", height: " + height;
  }
  public int compareTo(Object tri2){
    if(tri2 instanceof RightTriangle){
      RightTriangle tri3 = (RightTriangle) tri2;
      if(this.height == tri3.getHeight()){
        return 0;
      }else if(this.height > tri3.getHeight()){
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
