package com.company;

public class TestTax {
    public static void main(String[] args) {

Tax t = new Tax();
t.grossIncome = 50000;
t.numberOfDepends = 2;
t.state = "NJ";

double yourTax = t.calcTax();

        System.out.println("Your tax is" + yourTax);

    }
}
