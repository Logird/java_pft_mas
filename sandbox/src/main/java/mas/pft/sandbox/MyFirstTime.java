package mas.pft.sandbox;

public class MyFirstTime {

  public static void main (String[] args){
    System.out.println("Вычисление расстояния между двумя точками в прямоугольной системе координат");
    //первая точка
    Point a = new Point(2.4, 8);
    System.out.println("Координаты точки А: " + "(" + a.x + ", " + a.y + ").");
    //вторая точка
    Point b = new Point(-8, -16);
    System.out.println("Координаты точки Б: " + "(" + b.x + ", " + b.y + ").");
    System.out.println();

    System.out.println("Расстояние между точками равно " + distance (a, b));
  }
  public static double distance (Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y),2));
  }
}