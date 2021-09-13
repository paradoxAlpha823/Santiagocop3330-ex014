/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        System.out.print("What is the State? ");
        String s2 = x.nextLine();
        String s2u = s2.toUpperCase();

        double st = num1;
        double tax = st*0.055;
        double tot1 = (st+tax)*100;
        double tot2 = Math.ceil(tot1);
        double tot = tot2/100;

        if(s2u.equals("WI")){
            System.out.println("The subtotal is $"+st+"\r\nThe tax is $"+tax+"\r\nThe total is $"+tot);
            System.exit(0);
        }

        System.out.println("The total is $"+st);
        System.exit(0);
    }
}
