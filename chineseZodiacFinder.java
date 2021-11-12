import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
            double birthYear;
            String chineseZodiac = "";

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the your birth year : ");
            birthYear = scan.nextDouble();

            if (birthYear % 12 == 0){
                chineseZodiac = "Monkey";
            }
            else if (birthYear % 12 == 1){
                chineseZodiac = "Cock";
            }
            else if (birthYear % 12 == 2){
                chineseZodiac = "Dog";
            }
            else if (birthYear % 12 == 3){
                chineseZodiac = "Pig";
            }
            else if (birthYear % 12 == 4){
                chineseZodiac = "Mouse";
            }
            else if (birthYear % 12 == 5){
                chineseZodiac = "Bull";
            }
            else if (birthYear % 12 == 6){
                chineseZodiac = "Tiger";
            }
            else if (birthYear % 12 == 7){
                chineseZodiac = "Rabbit";
            }
            else if (birthYear % 12 == 8){
                chineseZodiac = "Dragon";
            }
            else if (birthYear % 12 == 9){
                chineseZodiac = "Snake";
            }
            else if (birthYear % 12 == 10){
                chineseZodiac = "Horse";
            }
            else{
                chineseZodiac = "Sheep";
            }

        System.out.println("Your Chinese Zodiac is : " + chineseZodiac);

        }



    }




