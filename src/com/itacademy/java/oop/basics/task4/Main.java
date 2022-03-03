package com.itacademy.java.oop.basics.task4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Validation validation = new Validation(10, true, 2, 2, 1, 1);

        while(true){
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            System.out.println(validation.isValid(password));

            System.out.print("Do you want to continue? y/n : ");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }
}
