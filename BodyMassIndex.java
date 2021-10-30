import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        double height, weight;
        double bodyMassIndex ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height : ");
        height = scan.nextDouble();

        System.out.println("Enter the weight : ");
        weight = scan.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.println("Body mass index is  : " + bodyMassIndex);
    }
}
