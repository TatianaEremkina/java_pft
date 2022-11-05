package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.junit.Test;

public class PointTests {

  @Test
  public void testDistance(){
    Point a = new Point(3,7);
    Point b = new Point(1, 7);
    Assert.assertEquals(a.distance(b),2.0);
  }

}
