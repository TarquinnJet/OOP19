//унаследовать от пр€моугольника и передавать в конструктор одну и ту же сторону дважды

package lesson4_Inhertit_Hometask;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Quadrate extends Shapes {
	private double side, perimetr, square;

	private static int quadratesCount = 0;

	public Quadrate() {
		this.side = Math.random() * 9;
		this.perimetr = perimetr();
		this.square = square();
		quadratesCount++;
	}
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getSquare() {
		return square;
	}
	public static int getCount() {
		return quadratesCount;
	}

	public double perimetr() {
		return this.side * 4;
	}

	public double square() {
		return this.side * this.side;
	}

	public void about() {
		DecimalFormatSymbols separator = new DecimalFormatSymbols();
		separator.setDecimalSeparator('.');
		DecimalFormat f = new DecimalFormat("#,##0.00", separator);
		System.out.println(" вадрат со стор-ой " + f.format(side)
				+ ". ѕлощадь : " + f.format(square) + ". ѕер-р " + ": "
				+ f.format(perimetr));
	}
}
