//Доп. домашнее задание:
//09.04.15 [0:25:45] Stefan It-Centre: Написать класс число (Number), 
//Хранит в себе значение int.
//выполняет следующие операции:
// - получение примитива (метод int get())
// - сложение (метод Number add(Number num))
// - вычитание (метод Number sub(Number num))
// - умножение (метод Number mul(Number num))
// - деление (метод Number div(Number num))
// - возведение в степень (метод Number pow(Number exponent))
// - вычисление факториала (метод Number fact())
// - вычисление остатка от деления (метод Number mod(Number num)) 

package lesson4_Inhertit_Hometask;

//ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
//JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [../../../src/share/back/util.c:838]
public class Number {

	private int num;
	private long factorial;// не нужно было. должен был вернуть новую сущность.

	public Number() {
		this.num = (int) (Math.random() * 11);
		this.fact();
	}

	public Number(int num) {
		this.num = num;
		this.fact();
	}

	public int getIntNum() {
		return this.num;
	}

	public void setIntNum(int num) {
		this.num = num;
	}

	public long getFactorial() {
		return factorial;
	}

	public Number add(Number num) {
		System.out.println("add(" + this.getIntNum() + " + " + num.getIntNum()
				+ "):");
		return new Number(num.getIntNum() + this.getIntNum());
	}

	public Number sub(Number num) {
		System.out.println("sub(" + this.getIntNum() + " - " + num.getIntNum()
				+ "):");
		return new Number(this.getIntNum() - num.getIntNum());
	}

	public Number mul(Number num) {
		System.out.println("mul(" + this.getIntNum() + " * " + num.getIntNum()
				+ "):");
		return new Number(this.getIntNum() * num.getIntNum());
	}

	public Number div(Number num) {
		if (num.getIntNum() == 0)
			System.out.println("Div by zero");
		else
			System.out.println("div(" + this.getIntNum() + " / "
					+ num.getIntNum() + "):");
		return new Number(this.getIntNum() / num.getIntNum());
	}

	public Number pow(Number num) {
		System.out.println("pow(" + this.getIntNum() + " ^ " + num.getIntNum()
				+ "):");
		return new Number((int) (Math.pow(this.num, num.num)));
	}

	public Number fact() {
		// this.factorial =
		// lesson2.Task1Recurs.recursivFactorial(this.getIntNum()); - почему-то
		// вылетает переполнение стека, хотя рекурсивный метод возвращает
		// переменную типа long
		long fact = 1;
		for (int i = 1; i <= this.num; i++)
			fact *= i;
		this.factorial = fact;
		return this;
	}

	public Number mod(Number num) {
		System.out.println("mod(" + this.getIntNum() + " % " + num.getIntNum()
				+ ");");
		this.setIntNum(this.getIntNum() % num.getIntNum());
		this.fact();
		return this;
	}

	public void about() {
		System.out.println("my num - \"" + this.num + "\", факт-ал - \""
				+ this.factorial + "\".");
	}

	public String toString() {
		return String.valueOf(num);
	}
}
