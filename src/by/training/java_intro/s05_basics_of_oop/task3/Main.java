package by.training.java_intro.s05_basics_of_oop.task3;

import java.util.Date;

/*
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        calendar.addDayOff(new Date(2021, java.util.Calendar.JULY,19), "Saturday");

        System.out.println(calendar.getDayOffList());
    }
}
