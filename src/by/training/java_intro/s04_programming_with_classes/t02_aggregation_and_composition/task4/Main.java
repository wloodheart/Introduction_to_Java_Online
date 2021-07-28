package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.List;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
	public static void main(String[] args) {

		Bank bank = new Bank();
		Client client = new Client();

		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(100));
		accounts.add(new Account(-50));
		accounts.add(new Account(200));

		List<Client> clients = new ArrayList<>();
		clients.add(client);

		client.setAccounts(accounts);
		bank.setClients(clients);

		System.out.println(bank);
	}
}