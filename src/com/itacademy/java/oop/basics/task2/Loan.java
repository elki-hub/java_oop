package com.itacademy.java.oop.basics.task2;

import java.time.LocalDate;

public class Loan {
    private int id;
    private double amount;
    private LoanType type;
    private LocalDate termDate;

    public Loan() {
    }

    public Loan(int id, double amount, LoanType type, LocalDate termDate) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.termDate = termDate;
    }

    public double getAmount() {
        return amount;
    }

    public LoanType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n Loan{" +
                "\n     id=" + id +
                ",\n    amount=" + amount +
                ",\n    type=" + type +
                ",\n    termDate=" + termDate +
                '}';
    }
}
