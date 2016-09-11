package mas.pft.sandbox;

public class MyFirstTime {

  public static void main (String[] args){
    System.out.println("Вычисление расстояния между двумя точками в прямоугольной системе координат");
    //первая точка
    Point A = new Point();
    A.x = 2.4;
    A.y = 8;
    System.out.println("Координаты точки А: " + "(" + A.x + ", " + A.y + ").");
    //вторая точка
    Point B = new Point();
    B.x = -8;
    B.y = -16;
    System.out.println("Координаты точки Б: " + "(" + B.x + ", " + B.y + ").");
    System.out.println();
    
    System.out.println("Расстояние между точками равно " + distance (A, B));
  }
  public static double distance (Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y),2));
  }
}