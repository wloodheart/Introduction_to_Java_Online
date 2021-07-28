package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Client> clients;

	public Bank() {
		clients = new ArrayList<>();
	}

	public Bank(List<Client> clients) {
		this.clients = clients;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Bank [clients=" + clients + "]";
	}

	
}
