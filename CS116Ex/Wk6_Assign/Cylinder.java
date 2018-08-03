public class Cylinder extends Circle{
  private double depth;
  private double volume;

  public Cylinder(){
    super(); // I actually don't need these because super's default is instantiated automatically
    depth = 0.0;
    volume = 0.0;
  }
  public Cylinder(double dep1){
    super(); // I actually don't need these because super's default is instantiated automatically
    depth = dep1;
    volume = 0.0;
  }
  public Cylinder(double rad2, double height){
    super(rad2);
    depth = height;
    volume = super.calcArea() * depth;
  }
  public void setDepth(double dep){
    volume = super.calcArea() * depth;
    depth = dep;
  }
  public double getDepth(){
    return depth;
  }
  public double calcVolume(){
    return volume;
  }
  public boolean equals(Cylinder cy1){
    if((this.depth == cy1.getDepth())&&(this.volume == cy1.calcVolume())){
      return true;
    }else{
      return false;
    }
  }
  @Override
  public String toString(){
    return super.toString() + ", Depth: " + depth + ", Volume: " + volume;
  }
}// end of class
