/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trylanga;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Trylanga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        int b = 0;
        int c = 1;
        int d = 0;

        System.out.println("The Fibonscci sequence is: ");
        while (d < a) {

            System.out.print(b + " ");
            int e = b + c;
            b = c;
            c = e;
            d++;
        }
    }
}
