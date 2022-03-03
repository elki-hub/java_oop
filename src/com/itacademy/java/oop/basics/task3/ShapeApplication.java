package com.itacademy.java.oop.basics.task3;

public class ShapeApplication {
    public static void main(String[] args) {
        Square[] squares = new Square[]{
                new Square(26, 67),
                new Square(-2, 3),
                new Square(-50, -20),
                new Square(6, -8)
        };

        printSquares(squares);
    }

    public static void printSquares(Square[] squares){
        for (Square square: squares) {
            System.out.println(square);
        }
    }
}
