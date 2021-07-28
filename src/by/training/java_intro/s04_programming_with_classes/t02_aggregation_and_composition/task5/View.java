package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition.task5;

import java.util.List;

public class View {
    private final TravelAgent travelAgent;

    public View(TravelAgent travelAgent) {
        this.travelAgent = travelAgent;
    }

    public TravelAgent getTravelAgent() {
        return travelAgent;
    }

    public void printVouchersByType(Type inputType, Transport inputTransport, Food inputFood, int inputDays) {
        List<Voucher> list = travelAgent.getVoucherListByType(inputType, inputTransport, inputFood, inputDays);
        if(list.isEmpty()) System.out.println("По данному запросу путевок не найдено.");
        else System.out.println(list);
    }

    @Override
    public String toString() {
        return "View{" +
                "travelAgent=" + travelAgent +
                '}';
    }
}
