import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
            double year;


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the year : ");
            year = scan.nextDouble();

            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

            if (isLeapYear){
                System.out.println(year + " is a leap year : ");
            }
            else {
                System.out.println(year + " is not a leap year : ");
            }


        }



    }




