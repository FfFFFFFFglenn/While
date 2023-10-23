/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Fedrequilan_CPE
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = input.nextInt();

        int sum = 0;
        for (int i = 2; i <= a; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i + " is prime" );
                sum = sum + i;

                System.out.println("The sum of prime no. below or equal to " + i + " = " + sum);
            }

        }
        // TODO code application logic here
    }
}
