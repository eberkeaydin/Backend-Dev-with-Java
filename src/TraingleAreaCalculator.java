package com.company;
import java.util.Scanner;


public class TraingleAreaCalculator {

    public static void main(String[] args) {

        /*

         */

        int edgeOne, edgeTwo, sideOne, sideTwo, sideThree, perimeter, areaU;
        double area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the edge : ");
        edgeOne = scan.nextInt();

        System.out.println("Enter the other edge : ");
        edgeTwo = scan.nextInt();

        double hypotenuse = Math.sqrt(edgeOne * edgeOne + edgeTwo * edgeTwo);
        System.out.println("Hypotenuse of triangle : " + hypotenuse);

        System.out.println("Enter the edge : ");
        sideOne = scan.nextInt();

        System.out.println("Enter the other edge : ");
        sideTwo = scan.nextInt();

        System.out.println("Enter the last edge : ");
        sideThree = scan.nextInt();

        perimeter = sideOne + sideTwo + sideThree;
        areaU = perimeter / 2;
        area = Math.sqrt((areaU * (areaU - sideOne) * (areaU - sideTwo) * (areaU - sideThree)));
        System.out.println("Area of triangle is : " + area);


    }
}


