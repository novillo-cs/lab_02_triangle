public class Point{
  private double x, y;

  // Constructors
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  // Getters
  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }

  // CLASS METHODS
  
  /* Return a string with a coordinate values: (x, y)
  *  "(0.0, 0.0)"  or  "(- 10.5, 12.0)"
  */
  public String toString(){
    // YOUR CODE HERE
    return "";
  }
  
  public static double distance(Point a, Point b){
   // YOUR CODE HERE
    return 0.0;
  }
  
  public double distanceTo(Point other){
    // YOUR CODE HERE
    return 0.0;
  }


}
