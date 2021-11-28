import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        String islem ;
        double numOne, numTwo, result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("What operator is you want to use ? (+, -, *, /, %) : ");
        islem = scan.next();

        System.out.println("Number one : ");
        numOne = scan.nextDouble();

        System.out.println("Number two : ");
        numTwo = scan.nextDouble();

        switch (islem){
            case "+":  result = numOne + numTwo;
                System.out.println(result);
            break;

            case "-": result = numOne - numTwo;
                System.out.println(result);
            break;

            case "*": result = numOne * numTwo;
                System.out.println(result);
            break;

            case "/": result = numOne / numTwo;
                System.out.println(result);
            break;

            case "%": result = numOne % numTwo;
                System.out.println(result);
            break;

            default : System.out.println("Invalid enters !");
        }

    }
}
