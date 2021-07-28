package by.training.java_intro.s04_programming_with_classes.t01_class_and_object;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
public class Task5 {
    public static void main(String[] args) {
        Counter counter = new Counter(0, 0, 10);

        System.out.println(counter.getCount());
        counter.enlarge();
        System.out.println(counter.getCount());
        counter.reduce();
        System.out.println(counter.getCount());
        counter.reduce();
        System.out.println(counter.getCount());
    }
}

class Counter {
    private int count;
    private int from;
    private int to;

    public Counter() {
        count = 0;
        from = 0;
        to = Integer.MAX_VALUE;
    }

    public Counter(int count, int from, int to) {
        this.count = count;

        if (from < count) this.from = from;
        else this.from = count;

        if (to > count) this.to = to;
        else this.to = count;
    }

    public void enlarge() {
        if (count < to) count++;
        else System.out.println("Достигнуто максимальное значение счетчика!");
    }

    public void reduce() {
        if (count > from) count--;
        else System.out.println("Достигнуто минимальное значение счетчика!");
    }

    public int getCount() {
        return count;
    }
}