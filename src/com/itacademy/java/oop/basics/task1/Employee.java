package com.itacademy.java.oop.basics.task1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private ContractType type;
    private LocalDate date;
    private double salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, ContractType type, LocalDate startDate, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.date = startDate;
        this.salary = salary;
        this.position = position;
    }

    public void printInfo(){
        System.out.printf(
                "Employee information: \n" +
                        "name: %s %s \n" +
                        "contract: \n" +
                        "   type: %s \n" +
                        "   start date: %s \n" +
                        "   salary: %.2f \n" +
                        "   position: %s",
                name, surname, type, date.toString(), salary, position
        );
    }


}
