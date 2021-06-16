package by.training.wlood.s04_programming_with_classes.t02_aggregation_and_composition;

import java.util.Arrays;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Task2 {
	public static void main(String[] args) {
		Car volkswagen = new Car("volkswagen", "Itegro", "EA111");

		volkswagen.go();
		volkswagen.refuel();
		volkswagen.displayBrand();
		volkswagen.changeWheel(3, new Wheel("W616"));

		System.out.println(volkswagen);
	}

}

class Car {
	private String brand;
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;

	public Car(String brand, String wheelsName, String engineName) {
		this.brand = brand;
		this.engine = new Engine(engineName);

		for (int i = 0; i < wheels.length; i++)
			this.wheels[i] = new Wheel(wheelsName);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void go() {
		System.out.println("*" + brand + " rides*");
	}

	public void refuel() {
		System.out.println("*" + brand + " refueling*");
	}

	public void changeWheel(int wheelNum, Wheel inputWheel) {
		wheels[wheelNum - 1] = inputWheel;
	}

	public void displayBrand() {
		System.out.println(brand);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", wheels=" + Arrays.toString(wheels) + ", engine=" + engine + "]";
	}

}

class Wheel {
	private String whellName;

	public Wheel(String whellName) {
		this.whellName = whellName;
	}

	public String getWhellName() {
		return whellName;
	}

	public void setWhellName(String whellName) {
		this.whellName = whellName;
	}

	@Override
	public String toString() {
		return whellName;
	}
}

class Engine {
	private String engineName;

	public Engine(String engineName) {
		this.engineName = engineName;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return engineName;
	}
}