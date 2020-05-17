package me.sibalnirbhay;

import me.sibalnirbhay.classes.Customer;
import me.sibalnirbhay.classes.Movie;
import me.sibalnirbhay.classes.Price;
import me.sibalnirbhay.classes.Rental;

public final class Main {

  private Main() {}

  public static void main(String[] args) {
    Customer tony = new Customer("Tony");
    Customer peter = new Customer("Peter");

    Movie avengers = new Movie("The Avengers", new Price(Movie.REGULAR));
    Movie endgame = new Movie("Endgame", new Price(Movie.NEW_RELEASE));
    Movie homeComing = new Movie("Home Coming", new Price(Movie.CHILDREN));

    tony.addRental(new Rental(avengers, 9));
    tony.addRental(new Rental(endgame, 15));

    peter.addRental(new Rental(homeComing, 12));
    peter.addRental(new Rental(avengers, 4));

    System.out.println(tony.statement());
    System.out.println(peter.statement());
  }
}
