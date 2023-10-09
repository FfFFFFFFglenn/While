/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switchconverter;

import java.util.Scanner;

/**
 *
 * @author Fedrequilan_CPE
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Select option"
                    + " [1: Temperature Converter]"
                    + " [2: Even and Odd Checker]"
                    + " [3: Trigonometry Calculations]"
                    + " [4: Polygons surface area]");
            int a = input.nextInt();
            OUTER:
                         switch (a) {
                        case 1: {
                        while (true) {

                        System.out.println("Select Option:"
                                + " [1: C to F]"
                                + " [2: F to C]"
                                + " [3: K to F]"
                                + " [4: F to K]"
                                + " [5: K to C]"
                                + " [6: C to K]");
                        int g = input.nextInt();
                        switch (g) {
                            case 1: {
                            System.out.println(" Enter No. of Celcius");
                            int c = input.nextInt();
                            double ans = (c * 9 / 5) + (32);
                            System.out.println("The answer is:" + ans + " Fahrenheit");
                            break;
}
                        case 2: {
                            System.out.println("Enter No. of Fahrenheit");
                            int t = input.nextInt();
                            float ans = (t - 32) * 5 / 9f;
                            System.out.println("The answer is:" + ans + " Celcius");
                            break;
}
                        case 3: {
                            System.out.println("Enter No. of Kelvin");
                            int r = input.nextInt();
                            float ans = ((r - 273.15f) * 9 / 5 + 32);
                            System.out.println("The answer is:" + ans + " Fahrenheit");
                            break;
}
                        case 4: {
                            System.out.println("Enter No. of Fahrenheit");
                            double p = input.nextInt();
                            double ans = (((p - 32) * 5 / 9) + 273.15);
                            System.out.println("The answer is:" + ans + " Kelvin");
                            break;
}
                        case 5: {
                            System.out.println("Enter No. of Kelvin");
                            int h = input.nextInt();
                            double ans = (h - 273.15);
                            System.out.println("The answer is:" + ans + " Celcius");
                            break;
}
                        case 6: {
                            System.out.println("Enter No. of Celcius");
                            int j = input.nextInt();
                            double ans = (j + 273.15);
                            System.out.println("The answer is:" + ans + " Kelvin");
                            break;
}
                            default:
}
                            System.out.println("");
                            System.out.println("You want another calculations?"
                            + " [0: YES]" + " [1: NO]");
                            v = input.nextInt();
                            if (v == 0) {
                            System.out.println("");
}                           else if (v == 1) {
                            System.out.println("Thank you!!!!!");
                            break;
}
}
                            
}                           break;  
                case 2: {
                            while (true){
                            System.out.println("Even and Odd Checker");
                            System.out.println("Enter Number:");
                            int b = input.nextInt();
                            if (b % 2 == 0) {
                            System.out.println("The Number is Even");
}                           else {
                            System.out.println("The nummber is Odd");
}
                            System.out.println("");
                            System.out.println("You want another calculations?"
                            + " [0: YES]" + " [1: NO]");
                            v = input.nextInt();
                            if (v == 0) {
                            System.out.println("");
}                           else if (v == 1) {
                            System.out.println("Thank you!!!!!");
                            break ;
}
}
}               break;
                case 3: { 
                        while (true) {
                            System.out.println(" ");
                            System.out.println("Select Trigo Function:"
                            + " 1: Sin"
                            + " 2: Cos"
                            + " 3: Tan");
                            int e = input.nextInt();
                            switch (e) {
                        case 1: {
                            System.out.println("Enter Number");
                            int f = input.nextInt();
                            double ans = Math.sin(f * (Math.PI / 180));
                            System.out.println(ans);
                            break;
}
                        case 2: {
                            System.out.println("Enter Number");
                            int f = input.nextInt();
                            double ans = Math.cos(f * (Math.PI / 180));
                            System.out.println(ans);
                            break;
}
                        case 3: {
                            System.out.println("Enter Number");
                            int f = input.nextInt();
                            double ans = Math.tan(f * (Math.PI / 180));
                            System.out.println(ans);
                            break ;
}               
}       
                            System.out.println("");
                            System.out.println("You want another calculations?"
                            + " [0: YES]" + " [1: NO]");
                            v = input.nextInt();
                            if (v == 0) {
                            System.out.println("");
}                           else if (v == 1) {
                            System.out.println("Thank you!!!!!");
                            break;}
}
}                          break;
                case 4: { 
                    while (true){
                            System.out.println("Select Polygons"
                            + " 1: Triangle"
                            + " 2: Sqaure"
                            + " 3: Rectangle"
                            + " 4: Parallelogram");
                    int r = input.nextInt();
                    switch (r) {
                        case 1: {
                            System.out.println("Enter the measurement of height");
                            int h = input.nextInt();
                            System.out.println("Enter the measurement of base");
                            int g = input.nextInt();
                            double x = (h * g) * 1 / 2;
                            System.out.println(x);
                            break;}
                        case 2: {
                            System.out.println("Enter the measurement of side");
                            int h = input.nextInt();
                            double k = h * h;
                            System.out.println(k);
                            break;}
                        case 3: {
                            System.out.println("Enter the measurement of length");
                            int h = input.nextInt();
                            System.out.println("Enter the measurement of width");
                            int k = input.nextInt();
                            double b = k * h;
                            System.out.println(b);
                            break;}
                        case 4: {
                            System.out.println("Enter the measurement of base");
                            int h = input.nextInt();
                            System.out.println("Enter the measurement of height");
                            int k = input.nextInt();
                            double b = k * h;
                            System.out.println(b);
                            break;}
}
                            System.out.println("");
                            System.out.println("You want another calculations?"
                            + " [0: YES]" + " [1: NO]");
                            v = input.nextInt();
                            if (v == 0) {
                            System.out.println("");
}                           else if (v == 1) {
                            System.out.println("Thank you!!!!!");
                            break;
}
}                
}      
}
}
}
}