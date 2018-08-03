public class ApplicationForCircleAndCylinder{
  public static void main(String[] args){
    Circle circleC = new Circle(4);
    Cylinder CylinC = new Cylinder(4,5);

    // Exercise 2
    System.out.println("Radius: " + CylinC.getRadius());
    CylinC.setRadius(5);
    System.out.println("New Radius: " + CylinC.getRadius());
    //Yes, calling method of parent class is possible in child class

    // Exercise 3
    // The Overriden method is the toString() Note: equals in child and parent is not overriden cuz they are different methods with differnt parameters
    // If super is commented out in cylinder constructors, cirlce is still instantiated but only with the default cuz the radius returned is 0.0;

    // Exercise 4
    Circle circ1 = new Circle();
    Cylinder cyl1 = new Cylinder(6,7);
    circ1 = cyl1;

    System.out.println("\nVolume: "+cyl1.calcVolume());
    System.out.println(cyl1);
    System.out.println("Area: " + cyl1.calcArea());
    // Conclude: when circ1 = cyl1 --> circ1 is casted from Circle to Cylinder(calling methods from); Note: cannot visa versa

  }
}
