/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activityfactorial;

import java.util.Scanner;

/**
 *
 * @author Fedrequilan_CPE
 */
public class Activityfactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = input.nextInt();
        double b = 1;
        System.out.println ("0!=1");
        for (int i = 1; i < a+1; i++) {
              b = b * i; 
         System.out.println(i + "!" + "=" + b); }  

        // TODO code application logic here
    }

}
