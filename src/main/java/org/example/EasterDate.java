package org.example;

import java.time.LocalDate;

public class EasterDate {
    public static void main(String[] args) {
        int year = 2022; // Beispieljahr

        // Computus Algorithmus
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int monat = 0;

        int m = (8 * (year / 100) + 13) / 25 - 2;
        int s = year / 100 - year / 400 - 2;
        m = (15 + s - m) % 30;
        int n = (6 + s) % 7;

        int d = (m + 19 * a) % 30;

        if ( d == 29 )
            d = 28;
        else if (d == 28 && a >= 11)
            d = 27;

        int e = (2 * b + 4 * c + 6 * d + n) % 7;

        int tag = 21 + d + e + 1;

        if (tag > 31)
        {
            tag = tag % 31;
            monat = 4;
        }
        if (tag <= 31)
            monat = 3;

        System.out.print("\nIm Jahr " + year + " ist der Ostersonntag am " + tag);
        System.out.println("." + monat + ".");


    }
}