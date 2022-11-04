package ru.stqa.pft.sandbox;

//класс Point для представления точек на двумерной плоскости

public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }


  public double distance(Point b){
    double d = ((b.x - this.x) * (b.x - this.x)) + ((b.y - this.y) * (b.y * this.y));
    return Math.sqrt(d);
  }

}
