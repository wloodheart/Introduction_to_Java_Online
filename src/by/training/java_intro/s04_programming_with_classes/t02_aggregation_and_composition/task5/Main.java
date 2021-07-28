package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition.task5;

import java.util.List;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {

        TravelAgent travelAgent = new TravelAgent(getTestVouchers());
        View view = new View(travelAgent);

        view.printVouchersByType(Type.TREATMENT, Transport.PLANE, Food.UAI, 10);

    }

    static List<Voucher> getTestVouchers() {
        return List.of(
                new Voucher("Manchester", Type.EXCURSIONS, Transport.PLANE, Food.AI, 21),
                new Voucher("Paris", Type.SHOPPING, Transport.CAR, Food.BB, 16),
                new Voucher("Sydney", Type.CRUISE, Transport.BUS, Food.FB, 40),
                new Voucher("Buenos Aires", Type.TREATMENT, Transport.PLANE, Food.UAI, 10),
                new Voucher("Tokyo", Type.REST, Transport.PLANE, Food.HB, 26),
                new Voucher("Istanbul", Type.CRUISE, Transport.VESSEL, Food.BB, 45),
                new Voucher("New York", Type.TREATMENT, Transport.VESSEL, Food.HB, 30),
                new Voucher("Barcelona", Type.TREATMENT, Transport.PLANE, Food.AI, 23)
                );
    }
}