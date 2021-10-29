package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        int kilometer;
        double taximeter = 0, total;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the kilometer : ");
        kilometer = scan.nextInt();

        total = (10 + (kilometer * 2.2));
        taximeter = (total < 20) ? 20 : total ;
        System.out.println("Taximeter is : " + taximeter);

    }
}


