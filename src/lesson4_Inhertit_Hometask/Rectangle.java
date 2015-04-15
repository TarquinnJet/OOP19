package lesson4_Inhertit_Hometask;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Rectangle extends Shapes {

	private double sideA, sideB, perimetr, square;

	private static int rectanglesCount = 0;

	public Rectangle() {
		this.sideA = Math.random() * 10;
		this.sideB = Math.random() * 7;
		this.perimetr = perimetr();
		this.square = square();
		rectanglesCount++;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideB() {
		return sideB;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getSquare() {
		return square;
	}

	public static int getCount() {
		return rectanglesCount;
	}

	public double perimetr() {
		return this.sideA * 2 + this.sideB * 2;
	}

	public double square() {
		return this.sideA * this.sideB;
	}

	public void about() {
		DecimalFormatSymbols separator = new DecimalFormatSymbols();
		separator.setDecimalSeparator('.');
		DecimalFormat f = new DecimalFormat("#,##0.00", separator);
		System.out.println("Прямоуг со стор-ами " + f.format(sideA) + " и "
				+ f.format(sideB) + ". Площадь : " + f.format(square)
				+ ". Пер-р " + ": " + f.format(perimetr));
	}

}
