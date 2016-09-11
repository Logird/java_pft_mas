package mas.pft.sandbox;

/**
 * Created by Alexander on 11.09.2016.
 */
public class Point {
  public double x;
  public double y;

  public Point (double x, double y){
    this.x = x;
    this.y =y;
  }
  public double distance (Point a, Point b){
    return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y),2));
  }
}
