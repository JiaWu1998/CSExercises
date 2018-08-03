public class Rectangle{
  private int length, width;
  private int area = 0;

  public Rectangle(){
    length = 0;
    width = 0;
  }
  public Rectangle(int leng,int wid){
    length = leng;
    width = wid;
  }
  public void setLength(int len){
    length = len;
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
  public int getArea(){
    area = this.length * this.width;
    return area;
  }
  public int getAreaOf(Rectangle rec){
    rec.area = rec.length * rec.width;
    return rec.area;
  }
  public String toString(){
    return "length:"+this.length+",width:"+this.width+",area:"+this.area;
  }
  public String toStringOf(Rectangle rec2){
    return "length:"+rec2.length+",width:"+rec2.width+",area:"+rec2.area;
  }
}
