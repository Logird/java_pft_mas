package mas.pft.sandbox;

public class MyFirstTime {

  public static void main (String[] args){
    System.out.println("Вычисление расстояния между двумя точками в прямоугольной системе координат");
    //первая точка
    Point p1 = new Point();
    p1.x = 2.4;
    p1.y = 8;
    //вторая точка
    Point p2 = new Point();
    p2.x = -8;
    p2.y = -16;

    double len = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    System.out.println("Расстояние между точками равно " + len);
  }
  
}