package by.training.java_intro.s04_programming_with_classes.t01_class_and_object;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Task6 {
	public static void main(String[] args) {
		Time time = new Time(24, 55, 10);
		
		System.out.print(time);
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 24)
			this.hour = hour;
		else
			this.hour = 0;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 60)
			this.minute = minute;
		else
			this.minute = 0;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 60)
			this.second = second;
		else
			this.second = 0;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	
}