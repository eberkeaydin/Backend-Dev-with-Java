package com.company;
import java.util.Scanner;

public class KdvCalculator {

    public static void main(String[] args) {

        /*
            Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
            (Not : KDV tutarını 18% olarak alın)
            KDV'siz Fiyat = 10;
            KDV'li Fiyat = 11.8;
            KDV tutarı = 1.8;
            Ödev :
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        float fee;
        float KDV = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the fee : ");
        fee = scan.nextInt();

        if (fee > 0 && fee < 1000){
            KDV = 0.18F;
        }
        else if (fee >= 1000) {
            KDV = 0.08F;
        }

        System.out.println("KDV fee is : " + (fee * KDV));
        }

    }



