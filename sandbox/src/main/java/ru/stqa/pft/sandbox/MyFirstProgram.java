package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String args[]){

		Square s = new Square(5);
		System.out.println("Площадь квадоата со стороной "  + s.l + " равна " +  s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

		Point a = new Point(3, 7);
		Point b = new Point(1, 7);

		System.out.println("Расстояние между 2 точками " + a.x + "," + a.y + " и " + b.x + "," + b.y + " равна " + a.distance(b));
		
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
			
	}
