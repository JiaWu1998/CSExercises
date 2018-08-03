public abstract class Shape{
  public String dimension;
  public abstract double calcArea();
  public abstract double calcPerimeter();
  public abstract String toString();
  //no problem: all methods were overriden correctly
  //this is for exercise 3 and 4 along with exercise 5
  //In 3 and 4, I have already decided to create a abstract superclass before exercise 5
  //there wasn't any restrictions in the instructions on what kind of superclass I could make

  //PROBLEM: "Shape can have an attribute of a dimension OR that can be left to be defined in the subclasses."
  //Could you clarify what data type is dimension?
  //What is the use of dimension? ---> there was no instructions on what to do with dimension
}
