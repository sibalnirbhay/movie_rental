package me.sibalnirbhay.classes;

import me.sibalnirbhay.abstractClasses.Price;

public class RegularPrice extends Price {
    public RegularPrice() {
        super(Movie.REGULAR);
    }

    public double amount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2) {
            thisAmount += (daysRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
