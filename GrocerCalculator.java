import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        double  cost;

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the pear : ");
        pearKg = scan.nextDouble();

        System.out.println("Enter the apple : ");
        appleKg = scan.nextDouble();

        System.out.println("Enter the tomato : ");
        tomatoKg = scan.nextDouble();

        System.out.println("Enter the banana : ");
        bananaKg = scan.nextDouble();

        System.out.println("Enter the eggplant : ");
        eggplantKg = scan.nextDouble();

        cost = (apple * appleKg) + (pear * pearKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg) ;


        System.out.println("Body mass index is  : " + cost);
    }
}
