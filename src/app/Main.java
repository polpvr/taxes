package app;

import java.util.Scanner;

public class Main {

    static double res;
    static double rate;

    private final static String CURRENCY = "UAH";

    public static void main(String[] args) {

        int a = 0;
        int b = 10000;
        int c = 25000;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");

        int d = input.nextInt();

        if (d>a & d<b) {
            rate = 2.5;
            res = d * rate / 100;
            System.out.println("Your tax amount is " + res + " " + CURRENCY);

        } else if (d>b & d<c) {
            rate = 4.3;
            res = d * rate / 100;
            System.out.println("Your tax amount is " + res + " " + CURRENCY);


        } else {
            rate = 6.7;
            res = d * rate / 100;
            System.out.println("Your tax amount is " + res + " " + CURRENCY);
        }


    }
}
