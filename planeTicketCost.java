import java.util.Scanner;
import java.lang.reflect.Field;
import java.lang.StringBuilder;

public class Test {
    public static void main(String[] args) {

        try {
            double age, range, travelType, ticketCost;

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the travel range(KM) : ");
            range = scan.nextDouble();


            while (!(range >= 0)) {
                System.out.println("You entered invalid characters. Try again : ");
                range = scan.nextDouble();

            }


            System.out.println("Enter the travel type(1 or 2) : ");
            travelType = scan.nextDouble();
            while (!((travelType == 1) || (travelType == 2))) {
                System.out.println("You entered invalid characters. Try again : ");
                travelType = scan.nextDouble();
            }


            System.out.println("Enter the your age : ");
            age = scan.nextDouble();
            while (!(age >= 1)) {
                System.out.println("You entered invalid characters. Try again : ");
                age = scan.nextDouble();
            }

            ticketCost = range / 10;

            if (travelType == 2) {
                ticketCost = ticketCost - (ticketCost / 5);
            }

            if ((age < 12)) {
                ticketCost = ticketCost - (ticketCost / 2);
            }
            if ((age > 12) && (age < 24)) {
                ticketCost = ticketCost - (ticketCost / 10);
            }
            if ((age >= 65)) {
                ticketCost = ticketCost - (ticketCost / 3);
            }

            System.out.println("Your ticket price is : " + ticketCost * travelType);
        } catch (Exception InputMismatchException) {
            System.out.println("You entered invalid characters. Please reboot the program again.");
        }
        


    }
}



