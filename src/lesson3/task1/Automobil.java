//написать клас машина. color, марка, текущее кол-во топлива,текущий пробегб макс число топлива. дата выпуска.включен ли ДВС. расход топлива.
//дожна уметь: ехать. получить колво км сколько надо проехать. сжигает топливо и увеличивает пробег. метод "старт ДВС"(только если есть топливо)
//выводить о себе инфо в консоль. должна уметь заправляться.
package lesson3.task1;

public class Automobil {
	private String model;
	private int tankCapacity;
	private int fuelConsuption;
	private int mileage;
	private boolean engineStart;
	private int nowFuel;

	public Automobil() {

	}

	public Automobil(String model, int tankCapacity, int fuelConsuption,
			int nowFuel) {
		if (nowFuel > 0 || nowFuel < this.tankCapacity)
			this.nowFuel = nowFuel;
		this.model = model;
		this.tankCapacity = tankCapacity;
		this.fuelConsuption = fuelConsuption;
		this.nowFuel = nowFuel;
	}

	public Automobil(String model, int tankCapacity, int fuelConsuption,
			int mileage, int nowFuel, boolean engineStart) {
		this(model, tankCapacity, fuelConsuption, nowFuel);
		this.mileage = mileage;
		this.engineStart = false;
	}

	public void setNowFuel(int nowFuel) {
		if (nowFuel > 0 && nowFuel < tankCapacity)
			this.nowFuel = nowFuel;
		else
			this.nowFuel = tankCapacity;
	}

	public int getNowFuel() {
		return nowFuel;
	}

	public void setMileage(int mileage) {
		if (mileage > this.mileage)
			this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setEngineStart(boolean engineStart) {
		this.engineStart = engineStart;
	}

	public int getFuelConsuption() {
		return fuelConsuption;
	}

	public String getModel() {
		return model;
	}

	public int getTankCapacity() {
		return tankCapacity;
	}

	public boolean start() {
		if (nowFuel > 0) {
			if (engineStart == false) {
				engineStart = true;
			} else {
				engineStart = false;
			}
		}
		return engineStart;

	}

	public void move(int distanse) {
		if (engineStart == false) {
			engineStart = true;
		}
		int needFuel = distanse / fuelConsuption;
		if (nowFuel > needFuel) {
			mileage += distanse;
			nowFuel -= needFuel;
		} else {
			mileage += nowFuel * fuelConsuption;
			nowFuel -= nowFuel * fuelConsuption / fuelConsuption;
			engineStart = false;
		}

	}

	public void fill(int fillFuel) {

		if (nowFuel + fillFuel <= tankCapacity) {

			nowFuel += fillFuel;
		} else {
			nowFuel = tankCapacity;
		}
	}

	public void about() {

		System.out.println("model : " + model + ", tCap : " + tankCapacity
				+ ", fCons : " + fuelConsuption + ", mileage : " + mileage
				+ ", fuelnow : " + nowFuel + ", started engine? : "
				+ engineStart);
	}

}
