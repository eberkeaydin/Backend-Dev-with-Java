import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        double num1, num2, num3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number one : ");
        num1 = scan.nextDouble();

        System.out.println("Enter the number two : ");
        num2 = scan.nextDouble();

        System.out.println("Enter the number three : ");
        num3 = scan.nextDouble();

        double one, two, three;
        if ( (num1 >= num2 && num1 >= num3) && num2 >= num3 ){
            System.out.println("Sorted numbers are" + num1 + " > " + num2 + " > " + num3);
        }
        else if (num1 >= num2 && num1 >= num3){
            System.out.println("Sorted numbers are" + num1 + " > " + num3 + " > " + num2);
        }

        else if ( (num2 >= num1 && num2 >= num3) && num1 >= num3 ){
            System.out.println("Sorted numbers are" + num2 + " > " + num1 + " > " + num3);
        }


        else if ((num2 >= num1 && num2 >= num3) && (num1 > num3)){
            System.out.println("Sorted numbers are" + num2 + " > " + num3 + " > " + num1);
        }


        else if ( (num3 >= num2 && num3 >= num1) && num2 >= num1 ){
            System.out.println("Sorted numbers are" + num3 + " > " + num2 + " > " + num1);
        }


        else if ((num3 >= num2 && num3 >= num1) && num1 >= num2){
            System.out.println("Sorted numbers are : " + num3 + " > " + num1 + " > " + num2);
        }



    }


    }



