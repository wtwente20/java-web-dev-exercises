package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

import static java.lang.Double.NaN;

public class Area {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = (input.nextDouble());
        double area = Circle.getArea(radius);

        if (!input.hasNextDouble()) {
            System.out.println("Error");
        } else {
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }




//        A = pi * r * r

//        Circle.getArea()
    }
}
