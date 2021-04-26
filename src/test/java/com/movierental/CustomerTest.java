package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void verifyThatTheGeneratedStatementIsCorrect(){
        Customer customer = new Customer("Vibhor");
        customer.addRental(new Rental(new Movie("GodFather", Movie.REGULAR),3));
        customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS),2));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE),4));

        assertEquals("Rental Record for Vibhor\n" +
                "\tGodFather\t3.5\n" +
                "\tToy Story\t1.5\n" +
                "\tAvengers\t12.0\n" +
                "Amount owed is 17.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

}