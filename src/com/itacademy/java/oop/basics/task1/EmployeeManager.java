package com.itacademy.java.oop.basics.task1;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        String name = "Vardenis";
        String surname = "Pavardenis";
        ContractType type = ContractType.valueOfCode("FT");
//        ContractType type = ContractType.FULL_TIME;
        LocalDate startDate = LocalDate.now();
        double salary = 3029;
        String position = "Manager";

        Employee employee = new Employee(name, surname, type, startDate, salary, position);

        employee.printInfo();


    }
}
