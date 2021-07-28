package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelAgent {
    private List<Voucher> voucherList;

    public TravelAgent() {
    }

    public TravelAgent(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public List<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public List<Voucher> getVoucherListByType(Type inputType, Transport inputTransport, Food inputFood, int inputDays) {
        List<Voucher> voucherListByType = new ArrayList<>();

        for (Voucher voucher : voucherList) {
            if (voucher.getType() == inputType && voucher.getTransport() == inputTransport
                    && voucher.getFood() == inputFood && voucher.getDays() == inputDays) {
                voucherListByType.add(voucher);
            }
        }

        voucherListByType.sort(Comparator.comparing(Voucher::getDestination));

        return voucherListByType;
    }

    @Override
    public String toString() {
        return "TravelAgent{" +
                "voucherList=" + voucherList +
                '}';
    }
}
