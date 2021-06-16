package by.training.wlood.s05_basics_of_oop.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

    private List<Product> productList;
    private int total;

    public Payment() {
        productList = new ArrayList<>();
    }

    public Payment(List<Product> productList) {
        this.productList = productList;
        calculateTotal();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
        calculateTotal();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void addProduct(String name, int price){
        productList.add(new Product(name, price));
        total += price;
    }

    public void calculateTotal(){
        int tmp = 0;
        for(Product product : productList)
            tmp += product.getPrice();

        total = tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return total == payment.total && Objects.equals(productList, payment.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList, total);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "productList=" + productList +
                ", total=" + total +
                '}';
    }

    private class Product {
        private String name;
        private int price;

        public Product() {
        }

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
