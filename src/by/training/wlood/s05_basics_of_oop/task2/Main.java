package by.training.wlood.s05_basics_of_oop.task2;

/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("qwe", 12);
        payment.addProduct("asd", 23);

        System.out.println(payment.getProductList());
    }
}
