package com.itacademy.java.oop.basics.task3;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        if(!isValid()){
            return "Square{" +
                    "length=" + length +
                    ", width=" + width +
                    "} values can't be negative";
        }
        return "Square{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}' ;
    }

   public double getPerimeter(){
        return length*2 + width*2;
    }

    public double getArea(){
        return length*width;
    }

    public boolean isValid(){
        if(length<0 || width<0)
            return false;
        else
            return true;
    }
}
