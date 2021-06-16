package by.training.wlood.s04_programming_with_classes.t02_aggregation_and_composition.task5;

public class Voucher {
    private final String destination;
    private final Type type;
    private final Transport transport;
    private final Food food;
    private final int days;

    public Voucher(String destination, Type type, Transport transport, Food food, int days) {
        this.destination = destination;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public Type getType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public Food getFood() {
        return food;
    }

    public int getDays() {
        return days;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "destination='" + destination + '\'' +
                ", type=" + type +
                ", transport=" + transport +
                ", food=" + food +
                ", days=" + days +
                '}';
    }
}
