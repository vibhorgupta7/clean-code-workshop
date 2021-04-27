package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    double totalAmount() {
      double totalAmount = 0;
      for (Rental each : this) {
        totalAmount += each.amount();
      }
      return totalAmount;
    }

    int totalFrequentRenterPoints() {
      int frequentRenterPoints = 0;
      for (Rental each : this) {
        frequentRenterPoints += each.FrequentRenterPoints();
      }
      return frequentRenterPoints;
    }
}
