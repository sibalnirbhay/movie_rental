package me.sibalnirbhay.price;

public abstract class Price {

    public Price(int priceCode) {
    }

    public abstract double amount(int daysRented);

    public int renterPoints(int daysRented) {
        return 1;
    }
}