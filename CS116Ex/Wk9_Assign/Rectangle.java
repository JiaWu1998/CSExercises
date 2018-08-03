public class Rectangle extends Shape implements Comparable{
  private int length;
  private int width;
  public Rectangle(){
    length = 0;
    width = 0;
  }
  public Rectangle(int len, int wid){
    length = len;
    width = wid;
  }
  public void setLength(int leng){
    length = leng;
  }
  public void setWidth(int widt){
    width = widt;
  }
  public int getLength(){
    return length;
  }
  public int getWidth(){
    return width;
  }
  public double calcArea(){
    return width * length;
  }
  public double calcPerimeter(){
    return 2 * (width + length);
  }
  public boolean equals(Rectangle rec1){
    if((this.length == rec1.getLength())&&(this.width == rec1.getWidth())){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return "length: " + length + ", width: " + width;
  }
  public int compareTo(Object rec2){
    if(rec2 instanceof Rectangle){
      Rectangle rec3 = (Rectangle) rec2;
      if(this.length == rec3.getLength()){
        return 0;
      }else if(this.length > rec3.getLength()){
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
