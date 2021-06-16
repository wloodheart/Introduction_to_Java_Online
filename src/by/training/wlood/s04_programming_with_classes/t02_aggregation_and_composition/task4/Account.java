package by.training.wlood.s04_programming_with_classes.t02_aggregation_and_composition.task4;

public class Account {
	private int value;
	private boolean blocking;

	{
		blocking = false;
	}

	public Account() {
	}

	public Account(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isBlocking() {
		return blocking;
	}

	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}

	@Override
	public String toString() {
		return "Account [value=" + value + ", blocking=" + blocking + "]";
	}

}
