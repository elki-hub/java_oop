package com.itacademy.java.oop.basics.task2;

public enum LoanType {
    LEASING("L"),
    CUSTOMER_LOAN("CL");

    public final String type;

    LoanType(String type) {
        this.type= type;
    }

    public static LoanType valueOfCode(String type) {
        for (LoanType e : values()) {
            if (e.type.equals(type)) {
                return e;
            }
        }
        return null;
    }
}
