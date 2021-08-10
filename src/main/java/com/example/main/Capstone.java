package com.example.main;
import java.util.Scanner;

public class Capstone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int months = 12;

        System.out.println("Hello welcome to my Home Loan Calculator");

        //Amount client would like to borrow
        System.out.println("Please enter the principle amount you would like to borrow");
        double principal = scanner.nextDouble();

        //Clients selected interest rate
        System.out.println("Please enter the interest rate");
        float interest = scanner.nextFloat();

        //Number of Years
        System.out.println("Please set how many years");
        int years = scanner.nextInt();








    }
}
