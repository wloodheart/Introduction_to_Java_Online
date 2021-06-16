package by.training.wlood.s04_programming_with_classes.t02_aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Account> accounts;

	public Client() {
		accounts = new ArrayList<>();
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Client [accounts=" + accounts + "]";
	}

}
