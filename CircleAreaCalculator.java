package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int radius, angle;
        double pi = 3.14;
        double perimeter = 0;
        double area = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of circle : ");
        radius = scan.nextInt();

        System.out.println("Enter the angle of circle : ");
        angle = scan.nextInt();

        perimeter = 2 * pi * radius;
        area = (pi * (radius * radius) * angle) / 360;

        System.out.println("Area of piece of circle : " + area);

    }
}


