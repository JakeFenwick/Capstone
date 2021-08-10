package com.example.main;
import java.util.Scanner;

public class Capstone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Cannot change
        final int weeks = 52;
        final int months = 12;
        final int year = 1;
        final float minSal = 35000;


        System.out.println("Hello welcome to my Home Loan Calculator");

        System.out.println("Please note that the calculator may not be able"  +
         " to give a value do due minimum salary requirements.");

        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();

        if(salary < minSal){
            System.out.println("Sorry your not eligidble for a loan ");
        } else { System.out.println("Thank you please proceed");}

        //Amount client would like to borrow
        System.out.println("Please enter the principle amount you would like to borrow");
        double principal = scanner.nextDouble();

        //Clients selected interest rate
        System.out.println("Please enter the interest rate");
        float interest = scanner.nextFloat();

        //Number of Years
        System.out.println("Please set how many years");
        int years = scanner.nextInt();

        // Create a method for calculating interest/months/years


        // print the output










    }
}

