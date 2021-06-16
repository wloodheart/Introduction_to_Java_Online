package by.training.wlood.s04_programming_with_classes.t01_class_and_object;

/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class Test1 {
	int a;
	int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void printValues() {
		System.out.println("a = " + a + "\nb = " + b);
	}

	public void sumValues() {
		System.out.println(a + b);
	}

	public void maxValues() {
		System.out.println(Math.max(a, b));
	}
}
