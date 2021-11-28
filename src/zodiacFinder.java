import java.util.Scanner;

public class zodiacFinder {
    public static void main(String[] args){
        double month, day, index;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the birth month : ");
        month = scan.nextDouble();

        System.out.println("Enter the birth day : ");
        day = scan.nextDouble();

        index = (month - 1) * 30 + day;
        if ( index <= 30) {
            System.out.println("Your zodiac is Aquarius ! ");
        }
        else if ( index > 49 && index <= 80) {
            System.out.println("Your zodiac is Fish ! ");
        }
        else if ( index > 80 && index <= 110) {
            System.out.println("Your zodiac is Aries ! ");
        }
        else if ( index > 110 && index <= 142) {
            System.out.println("Your zodiac is Taurus ! ");
        }
        else if ( index > 142 && index <= 172) {
            System.out.println("Your zodiac is Gemini ! ");
        }
        else if ( index > 172 && index <= 202) {
            System.out.println("Your zodiac is Cancer ! ");
        }
        else if ( index > 202 && index <= 232) {
            System.out.println("Your zodiac is Leo ! ");
        }
        else if ( index > 232 && index <= 262) {
            System.out.println("Your zodiac is Virgo ! ");
        }
        else if ( index > 262 && index <= 291) {
            System.out.println("Your zodiac is Libra ! ");
        }
        else if ( index > 291 && index <= 320) {
            System.out.println("Your zodiac is Scorpio ! ");
        }
        else if ( index > 320 && index < 350) {
            System.out.println("Your zodiac is Sagittarius ! ");
        }
        else{
            System.out.println("Your zodiac is Capricorn ! ");
        }
    }


    }



