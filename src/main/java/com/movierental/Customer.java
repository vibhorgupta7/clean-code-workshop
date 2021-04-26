package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    String result = "Rental Record for " + getName() + "\n";
    for (Rental each : rentals) {
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" +
          String.valueOf(each.amount()) + "\n";
    }

    //add footer lines result
    result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
    result += "You earned " + String.valueOf(totalFrequentRenterPoints())
        + " frequent renter points";
    return result;
  }

  private int totalFrequentRenterPoints() {
    int frequentRenterPoints = 0;
    for (Rental each : rentals) {
      frequentRenterPoints += each.FrequentRenterPoints();
    }
    return frequentRenterPoints;
  }

  private double totalAmount() {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += each.amount();
    }
    return totalAmount;
  }

  public String htmlstatement() {
    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
    for (Rental each : rentals) {
      //show figures for this rental
      result +=  each.getMovie().getTitle() + " " +
              String.valueOf(each.amount()) + "<br/>";
    }

    //add footer lines result
    result += "Amount owed is <b>" + String.valueOf(totalAmount()) + "</b><br/>";
    result += "You earned <b>" + String.valueOf(totalFrequentRenterPoints())
            + "</b> frequent renter points";
    return result;
  }

}

