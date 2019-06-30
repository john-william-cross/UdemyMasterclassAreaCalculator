package com.johncross;

public class Main {

    public static void main(String[] args) {

        area(5.0);
        area(5.0, 4.0);

    }

    public static double area(double radius){
        if (radius < 0) {
            System.out.println("Invalid value");
            return -1.0;
        } else {
            double areaOfCircle = (radius * radius * Math.PI);
            System.out.println(areaOfCircle);
            return areaOfCircle;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            double areaOfRectangle = x * y;
            System.out.println(areaOfRectangle);
            return areaOfRectangle;
        }
    }

}
