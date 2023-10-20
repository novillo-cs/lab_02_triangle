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

  public double getPerimeter(){
    // YOUR CODE HERE
    return 0.0;
  }

  public Point getVertex(int v){
    return null;
  }

  public void setVertex(int v, Point p){
    return null;
  }
  
  // How can you determine if two values are close enough to eachother?
  public static boolean closeEnough(double a, double b){
   // YOUR CODE HERE
    return false;
  }
  
  /* Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *  If one is 0.0, the other must be exactly 0.0.
  */
  public boolean equals(Point other){
    // YOUR CODE HERE
    return true;
  }


}
