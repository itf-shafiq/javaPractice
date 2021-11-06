package com.company;

import java.util.Scanner;

public class findGreatestNumber {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int numb01 = input1.nextInt();
        System.out.println("Enter 2nd Number: ");
        int numb02 = input1.nextInt();
        System.out.println("Enter 3rd Number: ");
        int numb03 = input1.nextInt();

        if(numb01 > numb02 && numb01 > numb03){
            System.out.println("Number 1 is greater number then other number");
        }
        else if (numb02 > numb01 && numb02>numb03){
            System.out.println("Number 2 is greater number then other number");
        }
        else{
            System.out.println("Number 3 is greater Number then other numbers");
        }

    }
}
