import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        double celcius;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature as celcius : ");
        celcius = scan.nextDouble();

        if (celcius < 5){
            System.out.println("You can go to ski ");
        }
        else if ((celcius >= 5) && (celcius < 15) ){
            System.out.println("You can go to cinema ");
        }
        else if ((celcius >= 15) && (celcius < 25)){
            System.out.println("You can go to picnic ");
        }
        else {
            System.out.println("You can go to swimming ");
        }
    }


    }

