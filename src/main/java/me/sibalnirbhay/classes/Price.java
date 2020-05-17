package me.sibalnirbhay.classes;

public abstract class Price {
    private int _priceCode;

    public Price(int priceCode) {
        _priceCode = priceCode;
    }

    abstract double amount(int daysRented);

    public int renterPoints(int daysRented) {
        return 1;
    }
}