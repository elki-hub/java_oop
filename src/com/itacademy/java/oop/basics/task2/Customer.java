package com.itacademy.java.oop.basics.task2;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans;

    public Customer() {
    }

    public Customer(String name, String surname, int age, int personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Customer{\n" +
                "\nname='" + name + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \nage=" + age +
                ", \npersonalNumber=" + personalNumber +
                ", \nleasing loans total amount=" + countLoansAmountByType(LoanType.LEASING) +
                ", \ncustomer loans total amount=" + countLoansAmountByType(LoanType.CUSTOMER_LOAN) +
                ", \nloans total amount=" + countLoansAmount() +
                ", \nloans=" + Arrays.toString(loans) +
                '}';
    }

    private double countLoansAmount(){
        double amount = 0;
        for (Loan loan: loans) {
            amount += loan.getAmount();
        }
        return amount;
    }

    private double countLoansAmountByType(LoanType type){
        double amount = 0;
        for (Loan loan: loans) {
            if(loan.getType() == type){
                amount += loan.getAmount();
            }
        }
        return amount;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public Loan[] getLoans() {
        return loans;
    }
}
