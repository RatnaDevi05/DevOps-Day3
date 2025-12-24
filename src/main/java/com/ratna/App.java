package com.ratna;

public class App {

    public static double calculateBill(double units) {

        if (units <= 0) {
            return 0;
        }

        double bill;

        if (units <= 50) {
            bill = units * 0.5;
        } else if (units <= 150) {
            bill = (50 * 0.5) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        return bill + (bill * 0.20); // 20% surcharge
    }

    public static void main(String[] args) {
        System.out.println("Electricity Bill Calculator");
    }
}
