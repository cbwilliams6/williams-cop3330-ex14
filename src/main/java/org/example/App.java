package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double wiTax = 0.055;

        System.out.println("What is the order amount? ");
        double order = input.nextDouble();
        System.out.println("What is the state? ");
        String state = input.nextLine(); // Again have to put this line or it just doesn't take the string input, prob weird formatting from the number input
        state = input.nextLine();

        double total;

        if(state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("WISCONSIN")) {
            double tax = order * wiTax;
            System.out.println("The tax is $" + String.format("%.2f", tax));
            total = order + tax;
        }
        else{
            total = order;
        }

        System.out.println("The total is $" + String.format("%.2f", total));
    }
}