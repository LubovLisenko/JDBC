package com.goit.jdbc.feature.database;

public class PrintProjectPrices {
    private long id;
    private int price;

    public PrintProjectPrices(long id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrintProjectPrices{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
