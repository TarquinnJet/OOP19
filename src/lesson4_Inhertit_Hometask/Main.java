package lesson4_Inhertit_Hometask;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------------------Geometry-------------------");
		ArrayList<Shapes> shapes = new ArrayList<>(Arrays.asList(
				new Triangle(), new Circle(), new Quadrate(), new Rectangle(),
				new Triangle(), new Circle(), new Quadrate(), new Rectangle()));
		for (Shapes sh : shapes) {
			sh.about();
		}
		System.out.println("Кругов - " + Circle.getCount() + " ед.");
		System.out.println("Треуг-в - " + Triangle.getCount() + " ед.");
		System.out.println("Квадратов - " + Quadrate.getCount() + " ед.");
		System.out.println("Прямоуг-ов - " + Rectangle.getCount() + " ед.");
		System.out.println("--------------------Numbers-------------------");
		Number num1 = new Number();
		Number num2 = new Number();
		Number num3 = new Number();
		Number num4 = new Number();
		Number num5 = new Number();
		Number num6 = new Number();
		ArrayList<Number> numbs = new ArrayList<>(Arrays.asList(num1, num2,
				num3, num4, num5, num6));
		for (Number nums : numbs)
			nums.about();
		Number num7 = num1.add(num6);
		num7.about();
		Number num8 = num2.pow(num4);
		num8.about();
		new Object().toString();
		System.out.println("--------------------Fractions-------------------");
		Fraction frac1 = new Fraction();
		Fraction frac2 = new Fraction();
		Fraction frac3 = new Fraction();
		Fraction frac4 = new Fraction();
		Fraction frac5 = new Fraction();
		Fraction frac6 = new Fraction();
		ArrayList<Fraction> fracs = new ArrayList<>(Arrays.asList(frac1, frac2,
				frac3, frac4, frac5, frac6));
		for (Fraction frac : fracs)
			frac.print();
		Fraction frac7 = frac1.sub(frac3);
		frac7.print();
		Fraction frac8 = new Fraction(3, 5);
		Fraction frac9 = new Fraction(2, 5);
		Fraction frac10 = frac8.add(frac9);
		Fraction frac11 = frac8.div(frac9);
		Fraction frac12 = frac8.mul(frac9);
		Fraction frac13 = frac8.sub(frac9);
		frac10.print();
		frac11.print();
		frac12.print();
		frac13.print();
	}
}
