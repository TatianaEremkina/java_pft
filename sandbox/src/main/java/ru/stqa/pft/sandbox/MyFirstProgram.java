package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String args[]){
		hello("world");
		hello("user");
		hello("Tatiana");

		Square s = new Square(5);
		System.out.println("Площадь квадоата со стороной "  + s.l + " равна " +  s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

		Point a = new Point(3, 7);
		Point b = new Point(1, 7);

		System.out.println("Расстояние между 2 точками " + a.x + "," + a.y + " и " + b.x + "," + b.y + " равна " + distance(a, b));
		
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double distance (Point a, Point b){
		double d = ((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y));
		return Math.sqrt(d);
	}

}