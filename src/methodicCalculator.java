import java.util.Scanner;

public class methodicCalculator {

    static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Sum of num1 and num2 is : " + result);
    }

    static void sub(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction of num1 and num2 is : " + result);
    }

    static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication of num1 and num2 is : " + result);
    }

    static int division(int num1, int num2) {
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    static void mod(int num1, int num2) {
        int result = num1 % num2;
        System.out.println("Modula of num1 and num2 is : " + result);
    }

    static void area(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Area of num1 and num2 quad is : " + result);
    }

    static void perimeter(int num1, int num2) {
        int result = 2 * (num1 + num2);
        System.out.println("Subtraction of num1 and num2 is : " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = """
                1 for sum\s
                2 for subtract\s
                3 for multiply\s
                4 for division\s
                5 for mod\s
                6 for area and perimeter for quad\s
                7 for exit""";

        while (true){
            System.out.println(menu);

            System.out.print("Enter the operation code : ");
            int select = scan.nextInt();

            if (select == 0 || select == 7){
                System.out.println("You entered invalid opcode ");
                break;
            }

            System.out.print("Enter the number one : ");
            int num1 = scan.nextInt();

            System.out.print("Enter the number two : ");
            int num2 = scan.nextInt();

            switch (select) {
                case 1 -> sum(num1, num2);
                case 2 -> sub(num1, num2);
                case 3 -> multiply(num1, num2);
                case 4 -> {
                    if (division(num1, num2) == 0) {
                        System.out.println("Infinite");
                    } else {
                        System.out.println("Division of num1 and num2 is : " + division(num1, num2));
                    }
                }
                case 5 -> mod(num1, num2);
                case 6 -> {
                    area(num1, num2);
                    perimeter(num1, num2);
                }
                default -> {
                }
            }
            System.out.println("------------");
        }





    }


}





