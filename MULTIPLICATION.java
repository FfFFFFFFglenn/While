/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiplication;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MULTIPLICATION {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number:");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + "x" + i + "= " + product);
        }
    }
}
