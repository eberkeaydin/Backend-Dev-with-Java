package com.company;
import java.util.Scanner;

public class calculateGradeAverage {

    public static void main(String[] args) {

        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan
        programı yazın.
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana
         "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
         */

        float mathGrade, physicsGrade, chemieGrade, turkishGrade, historyGrade, musicGrade;

        Scanner scan = new Scanner(System.in);

        System.out.println("Mathematics grade : ");
        mathGrade = scan.nextInt();

        System.out.println("Physics grade : ");
        physicsGrade = scan.nextInt();

        System.out.println("Chemistry grade : ");
        chemieGrade = scan.nextInt();

        System.out.println("Turkish grade : ");
        turkishGrade = scan.nextInt();

        System.out.println("History grade : ");
        historyGrade = scan.nextInt();

        System.out.println("Music grade : ");
        musicGrade = scan.nextInt();

        float generalGradeAverage = (mathGrade + physicsGrade + chemieGrade + turkishGrade + historyGrade + musicGrade) / 6;
        System.out.println("Grade average is : " + generalGradeAverage );
        System.out.println(generalGradeAverage >= 60 ? "You pass" : "You fail");

        
        }

    }
