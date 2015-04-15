package lesson4_Inhertit_Hometask;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Circle extends Shapes {

	private double radius, square, perimetr;
	private static int circlesCount = 0;

	public Circle() {
		this.radius = Math.random() * 10;
		this.perimetr = perimetr();
		this.square = square();
		circlesCount++;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getSquare() {
		return square;
	}

	public static int getCount() {
		return circlesCount;
	}

	@Override
	public double perimetr() {
		return Math.PI * 2 * this.radius;
	}

	@Override
	public double square() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public void about() {
		DecimalFormatSymbols separator = new DecimalFormatSymbols();
		separator.setDecimalSeparator('.');
		DecimalFormat f = new DecimalFormat("#,##0.00", separator);
		System.out.println("Круг с радиусом - " + f.format(radius)
				+ ". Площадь : " + f.format(square) + ". Пер-р : "
				+ f.format(perimetr));
	}
}
