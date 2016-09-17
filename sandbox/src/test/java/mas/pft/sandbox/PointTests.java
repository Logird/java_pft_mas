package mas.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alexander on 17.09.2016.
 */
public class PointTests {

  @Test
  public void testDistance(){
    Point a = new Point(-1, -1);
    Assert.assertEquals(a.distance(a, a), 0.0);
  }

  @Test
  public void testNegativeMeaning(){
    Point a = new Point(-2, -1);
    Point b = new Point(1, 3);
    Assert.assertEquals(a.distance(a, b), 5.0);
  }

  @Test
  public void testDistance2(){
    Point a = new Point(-10, -5);
    Point b = new Point(-1, -2);
    Assert.assertEquals(a.distance(a, b), a.distance(b,a));
  }
}
