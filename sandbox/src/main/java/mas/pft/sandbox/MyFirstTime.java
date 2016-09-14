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
    //вычисление и вывод результата
    System.out.println("Расстояние между точками равно " + a.distance (a, b));
    //нахождение точки, симметричной относительно начала системы координат
    Point c = a.symmetric(a);
    System.out.println("Точка С, с координатами " + "(" + c.x + "," + c.y + ")" + "является симметричной относительно ");
    System.out.println("начала координат по отношению к точке А с координатами "+ "(" + a.x + "," + a.y + ")");
  }

}