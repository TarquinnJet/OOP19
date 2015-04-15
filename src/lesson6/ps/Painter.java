package lesson6.ps;

public class Painter {
	public void draw(Drawable f) {
		f.paint();
	}
}

interface Drawable {
	void paint();
}

class Circle implements Drawable {

	@Override
	public void paint() {
		System.out.println("Circle");
	}
}

class Triangle implements Drawable {

	@Override
	public void paint() {
		System.out.println("Triangle");
	}
}