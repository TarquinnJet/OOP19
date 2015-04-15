package lesson4_Inhertit_Hometask;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Triangle extends Shapes {
	private double katet1, katet2, perimetr, square, hypotenuse;

	private static int trianglesCount = 0;

	public Triangle() {
		this.katet1 = Math.random() * 9;
		this.katet2 = Math.random() * 7;
		this.perimetr = perimetr();
		this.square = square();
		this.hypotenuse = getHypotenuse();
		trianglesCount++;
	}

	public void setKatet1(double katet1) {
		this.katet1 = katet1;
	}

	public void setKatet2(double katet2) {
		this.katet2 = katet2;
	}

	public double getKatet1() {
		return katet1;
	}

	public double getKatet2() {
		return katet2;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getSquare() {
		return square;
	}

	public double getHypotenuse() {
		return Math.sqrt(this.katet1 * this.katet1 + this.katet2 * this.katet2);
	}

	public static int getCount() {
		return trianglesCount;
	}

	public double perimetr() {
		return getHypotenuse() + this.katet1 + this.katet2;
	}

	public double square() {
		return katet1 * katet2 / 2;
	}

	public void about() {
		DecimalFormatSymbols separator = new DecimalFormatSymbols();
		separator.setDecimalSeparator('.');
		DecimalFormat f = new DecimalFormat("#,##0.00", separator);
		System.out.println("Прямоуг. треуг с кат-ми " + f.format(katet1)
				+ " и " + f.format(katet2) + ", и гипот. "
				+ f.format(hypotenuse) + ". Площадь : " + f.format(square)
				+ ". Пер-р " + ": " + f.format(perimetr));
	}
}
