package by.training.java_intro.s04_programming_with_classes.t01_class_and_object;

import java.util.Arrays;
import java.util.Comparator;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class Task4 {

	public static void main(String[] args) {
		Train[] trains = new Train[5];

		trains[0] = new Train("Hrodna", 729, "19:19");
		trains[1] = new Train("Homieĺ", 622, "17:11");
		trains[2] = new Train("Brest", 714, "19:53");
		trains[3] = new Train("Brest", 607, "17:30");
		trains[4] = new Train("Brest", 746, "12:14");

//		sortByTrainNumber(trains);
//		System.out.println(infoByTrainNumber(trains, 607));
		sortByDestination(trains);
		System.out.println(Arrays.toString(trains));

	}

	static void sortByDestination(Train[] trains) {
		Arrays.sort(trains, (Train t1, Train t2) -> {
			if (!t1.getDestination().equals(t2.getDestination()))
				return t1.getDestination().compareTo(t2.getDestination());
			else
				return CharSequence.compare(t1.getDepartureTime(), t2.getDepartureTime());
		});
	}

	static String infoByTrainNumber(Train[] trains, int trainNumber) {
		for (Train train : trains)
			if (train.getTrainNumber() == trainNumber)
				return train.toString();

		return "По введунному номеру поездов не найдено.";
	}

	static void sortByTrainNumber(Train[] trains) {
		Arrays.sort(trains, Comparator.comparingInt(Train::getTrainNumber));
	}

}

class Train {
	private String destination;
	private int trainNumber;
	private String departureTime;

	public Train(String destination, int trainNumber, String departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "\nTrain [destination=" + destination + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

}