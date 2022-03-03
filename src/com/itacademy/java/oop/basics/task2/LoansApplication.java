package com.itacademy.java.oop.basics.task2;

import com.itacademy.java.oop.basics.task1.ContractType;

import java.time.LocalDate;

public class LoansApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Vardenis", "Pavardenis", 24, 1357);
        Loan loan1 = new Loan(54, 4682.6, LoanType.LEASING, LocalDate.now());
        Loan loan2 = new Loan(55, 100, LoanType.valueOfCode("CL"), LocalDate.now());

        customer.setLoans(new Loan[]{loan1, loan2});
        System.out.println(customer);

    }
}
