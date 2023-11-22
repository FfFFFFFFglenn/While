/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primechecker;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PRIME {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int number = input.nextInt();
        boolean prime = true;
        int a = 2;
        System.out.println (a + " is prime");
        do {
            if (number % a == 0) {
                prime = false;
                break;
            }
            a++;
        } while (a <= Math.sqrt(number));
        if (prime && number > 1) {
           System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }

    }
}
