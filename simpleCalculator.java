package com.company;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1s Number:");
        int numb01 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int numb02 = input.nextInt();
        Scanner input01 = new Scanner(System.in);
        System.out.println("What do you want to do? Enter symble like: + or - or * or / : ");
        String job = input01.nextLine();

        int sum = numb01 + numb02;
        int sub = numb01 - numb02;
        int mult = numb01 * numb02;
        int divi = numb01 / numb02;

        switch (job){
            case "+":
                System.out.println("Addition of 1st Number and 2nd Number is: " + sum);
                break;
            case "-":
                System.out.println("Subtraction of 1st Number and 2nd Number is: " + sub);
                break;
            case "*":
                System.out.println("Multiplication of 1st Number and 2nd Number is: " + mult);
                break;
            case "/":
                System.out.println("Division of 1st Number and 2nd Number is: " + divi);
                break;
        }


    }
}
