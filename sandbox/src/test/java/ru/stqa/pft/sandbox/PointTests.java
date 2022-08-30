package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.junit.Test;

import static ru.stqa.pft.sandbox.MyFirstProgram.distance;

public class PointTests {
  @Test
  public void testDistance(){
    Point a = new Point(3,7);
    Point b = new Point(1, 7);
    double c = distance(a, b);
    Assert.assertEquals(c,2.0);
  }

}
