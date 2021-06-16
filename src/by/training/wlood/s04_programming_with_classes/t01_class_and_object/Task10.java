package by.training.wlood.s04_programming_with_classes.t01_class_and_object;

import java.util.Arrays;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Task10 {

	public static void main(String[] args) {
		Airline[] airlines = new Airline[5];

		airlines[0] = new Airline("Дубай", "FZ 1716", "Boeing 737-800", "01:06",
				new String[] { "wednesday", "saturday", "sunday" });
		airlines[1] = new Airline("Вена", "OS 690", "Embraer 195", "05:05",
				new String[] { "monday", "friday", "saturday", "sunday" });
		airlines[2] = new Airline("Франкфурт", "LH 1489", "Embraer 190", "06:10",
				new String[] { "monday", "tuesday", "friday", "saturday" });
		airlines[3] = new Airline("Ларнака", "B2 883", "Embraer 195", "08:20", new String[] { "tuesday", "saturday" });
		airlines[4] = new Airline("Стамбул", "B2 783", "Embraer 190", "08:20",
				new String[] { "monday", "tuesday", "saturday", "sunday" });

		AirlinesController controller = new AirlinesController(airlines);
//		controller.flightsByDestination("Дубай");
//		controller.flightsByDayOfWeek("monday");
		controller.flightsByDayOfWeek("monday", "06:00");
	}
}

class AirlinesController {
	private Airline[] airlines;

	public AirlinesController(Airline[] airlines) {
		this.airlines = airlines;
	}

	public Airline[] getAirlines() {
		return airlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	public void flightsByDestination(String inputDestination) {
		for (Airline airline : airlines)
			if (airline.getDestination().equals(inputDestination))
				System.out.println(airline);
	}

	public void flightsByDayOfWeek(String inputDayOfWeek) {
		for (Airline airline : airlines)
			for (String dayOfWeek : airline.getDaysOfWeek())
				if (dayOfWeek.equals(inputDayOfWeek))
					System.out.println(airline);
	}

	public void flightsByDayOfWeek(String inputDayOfWeek, String inputTime) {
		for (Airline airline : airlines)
			for (String dayOfWeek : airline.getDaysOfWeek())
				if (dayOfWeek.equals(inputDayOfWeek) && airline.getDepartureTime().compareTo(inputTime) == 1)
					System.out.println(airline);
	}
}

class Airline {
	private String destination;
	private String flightNumber;
	private String aircraftType;
	private String departureTime;
	private String[] daysOfWeek;

	public Airline(String destination, String flightNumber, String aircraftType, String departureTime,
			String[] daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + Arrays.toString(daysOfWeek)
				+ "]";
	}

}