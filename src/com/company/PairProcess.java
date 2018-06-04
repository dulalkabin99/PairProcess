package com.company;

import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();
        int sum = (num1+num2);
        int product = (num1*num2);
        int avg = (num1+num2)/2;

        if (sum>1000){
            System.out.println("sum: " + sum + "~");
        }
        else if (sum>200) {
                System.out.println("sum: " + sum + "*");
            }
        else {
                System.out.println("sum: " + sum);
        }
        System.out.println("Product: "+ product);
        System.out.println( "Average: "+ avg);
    }
}