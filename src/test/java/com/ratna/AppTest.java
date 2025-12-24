package com.ratna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAppConstructor() {
        new App(); // ⭐ covers default constructor
    }

    @Test
    void testNegativeUnits() {
        assertEquals(0.0, App.calculateBill(-10), 0.01);
    }

    @Test
    void testZeroUnits() {
        assertEquals(0.0, App.calculateBill(0), 0.01);
    }

    @Test
    void test50Units() {
        assertEquals(30.0, App.calculateBill(50), 0.01);
    }

    @Test
    void test100Units() {
        assertEquals(75.0, App.calculateBill(100), 0.01);
    }

    @Test
    void test200Units() {
        assertEquals(192.0, App.calculateBill(200), 0.01);
    }

    @Test
    void test300Units() {
        assertEquals(354.0, App.calculateBill(300), 0.01);
    }

    @Test
    void testMainMethod() {
        App.main(new String[]{}); // covers main()
    }
}
