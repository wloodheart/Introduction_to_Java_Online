package by.training.wlood.s04_programming_with_classes.t01_class_and_object;

import java.util.Arrays;
import java.util.Comparator;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class Task8 {
	public static void main(String[] args) {
		Customer[] customers = new Customer[5];

		customers[0] = new Customer(1, "Сирко", "Семён", "Анатолиевич",
				"692319, г. Алексин, ул. Успенского 4-й пер, дом 12, квартира 747", 3361_2532_6710_2382L,
				"BE73 2203 9948 8473");
		customers[1] = new Customer(2, "Сорокин", "Болеслав", "Борисович",
				"672043, г. Острогожское, ул. Багратионовский проезд, дом 48, квартира 808", 7056_9952_5265_1882L,
				"BE98 6886 4727 1419");
		customers[2] = new Customer(3, "Таранец", "Аким", "Данилович",
				"243515, г. Дорогобуж, ул. Филологический пер, дом 176, квартира 848", 5728_5290_5624_6996L,
				"BE51 4624 5892 4179");
		customers[3] = new Customer(4, "Сердюк", "Чарльз", "Леонидович",
				"403346, г. Лучегорск, ул. Короленко, дом 14, квартира 337", 1710_9125_4987_6999L, "BE37 8804 5988 3027");
		customers[4] = new Customer(5, "Лапин", "Лукиллиан", "Романович",
				"400059, г. Идринское, ул. Хорошевского Серебряного Бора 3-я линия, дом 95, квартира 8",
				9082_8342_1697_5007L, "BE16 1729 2203 3392");
		
		CustomerController controller = new CustomerController(customers);
//		controller.arrayInAphabetical();
		controller.cardRange(0, 5000_0000_0000_0000L);

	}
}

class CustomerController {
	private Customer[] customers;

	public CustomerController(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public void arrayInAphabetical() {
		Arrays.sort(customers, Comparator.comparing(Customer::getSurname));

		System.out.println("Покупатели в алфовитном порядке:");
		for (Customer customer : customers)
			System.out.println(customer);
	}

	public void cardRange(long from, long to) {
		System.out.println("Покупатели в диапазоне карт от " + from + " до " + to + ":");
		for (Customer customer : customers)
			if (customer.getCreditCardNumber() > from && customer.getCreditCardNumber() < to)
				System.out.println(customer);
	}
}

class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long creditCardNumber;
	private String bankAccountNumber;

	public Customer(int id, String surname, String name, String patronymic, String address, long creditCardNumber,
			String bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

}