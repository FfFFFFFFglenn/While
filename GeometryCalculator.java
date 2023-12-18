/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.geometrycalculator;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class GeometryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to PAVSA- Geometry Calculator\n");
            System.out.println("Option to Calulate");

            System.out.print("1: Calculate Perimeter\n" + "2: Calculate Area\n" + "3: Calculate Volume\n" + "4: Calculate surface area (3D shape)\n" + "5: Exit\n");

            Enter();
            int a = input.nextInt();

            switch (a) {

                case 1: {
                    do {
                        System.out.println("");
                        System.out.print("Select Option:\n" + "1. Rectangle\n" + "2. Square\n" + "3. Triangle\n" + "4. Trapezoid\n" + "5. Rhombus\n" + "6. Parallelogram\n" + "7. Cirlcle\n" + "8. Normal Polygon\n");
                        Enter();
                        int g = input.nextInt();
                        Space();

                        if (g == 1) {
                            RectangleP(input);
                        } else if (g == 2) {
                            SquareP(input);
                        } else if (g == 3) {
                            TriangleP(input);
                        } else if (g == 4) {
                            TrapezoidP(input);
                        } else if (g == 5) {
                            RhombusP(input);
                        } else if (g == 6) {
                            ParallelogramP(input);
                        } else if (g == 7) {
                            CirclrP(input);
                        } else if (g == 8) {
                            NagonP(input);
                        } else if (g<1 || g>5){
                            System.out.println("input is not valid");
                        };
                        Enter2();
                    } while (input.next().equalsIgnoreCase("yes"));
                    break;
                }

                case 2: {
                    do {
                        System.out.println("");
                        System.out.print("Select Option:\n" + "1. Rectangle\n" + "2. Square\n" + "3. Triangle\n" + "4. Trapezoid\n" + "5. Rhombus\n" + "6. Parallelogram\n" + "7. Circle\n");
                        Enter();
                        int h = input.nextInt();
                        Space();

                        if (h == 1) {
                            RectangleA(input);
                        } else if (h == 2) {
                            SquareA(input);
                        } else if (h == 3) {
                            TriangleA(input);
                        } else if (h == 4) {
                            TrapezoidA(input);
                        } else if (h == 5) {
                            RhombusA(input);
                        } else if (h == 6) {
                            ParallelogramA(input);
                        } else if (h == 7) {
                            CircleA(input);
                        } else if (h<1 || h>5){
                            System.out.println("input is not valid");
                        };
                        Enter2();
                    } while (input.next().equalsIgnoreCase("yes"));
                    break;
                }

                case 3: {
                    do {
                        System.out.println("");
                        System.out.println("Select Option:\n1. Cube\n2. Cuboid\n3. Cylinder\n4. Cone\n5. Sphere");
                        Enter();
                        int i = input.nextInt();
                        Space();

                        if (i == 1) {
                            CubeV(input);
                        } else if (i == 2) {
                            CuboidV(input);
                        } else if (i == 3) {
                            CylinderV(input);
                        } else if (i == 4) {
                            ConeV(input);
                        } else if (i == 5) {
                            SphereV(input);
                        } else if (i<1 || i>5){
                            System.out.println("input is not valid");
                        };
                        Enter2();
                    } while (input.next().equalsIgnoreCase("yes"));
                    break;
                }

                case 4: {
                    do {
                        System.out.println("");
                        System.out.println("Select Option:\n1. Cube\n2. Cuboid\n3. Cylinder\n4. Cone\n5. Sphere");
                        Enter();
                        int j = input.nextInt();
                        Space();

                        if (j == 1) {
                            CubeSA(input);
                        } else if (j == 2) {
                            CuboidSA(input);
                        } else if (j == 3) {
                            CylinderSA(input);
                        } else if (j == 4) {
                            ConeSA(input);
                        } else if (j == 5) {
                            SphereSA(input);
                        } else if (j<1 || j>5){
                            System.out.println("input is not valid");
                        };

                        Enter2();
                    } while (input.next().equalsIgnoreCase("yes"));
                    break;
                }

                case 5:
                    Space();
                    System.out.println("Thank you and have a nice day.. FIGHTHINGGG!!");
                    System.exit(0);

                default:
                    break;
            }

        }

    }

    static void RectangleP(Scanner input) {
        System.out.print("Enter the measurement of the lenght: ");
        double Length = input.nextDouble();
        System.out.print("Enter the measurement of the width: ");
        double Width = input.nextDouble();
        double perimeter = (Length + Width) * 2;
        System.out.println("  ");
        System.out.println("The perimeter of the parallegram is: " + perimeter);
    }
    
    static void ParallelogramP(Scanner input) {
        System.out.print("Enter the measurement of the lenght: ");
        double Length = input.nextDouble();
        System.out.print("Enter the measurement of the width: ");
        double Width = input.nextDouble();
        double perimeter = (Length + Width) * 2;
        System.out.println("  ");
        System.out.println("The perimeter of the parallegram is: " + perimeter);
    }

    static void SquareP(Scanner input) {
        System.out.print("Enter the measurement of the side of the square: ");
        double Length = input.nextDouble();
        double perimeter = Length * 4;
        System.out.println("  ");
        System.out.println("The perimeter of the squareis: " + perimeter);
    }
    
     static void RhombusP(Scanner input) {
        System.out.print("Enter the measurement of the side of the square: ");
        double Length = input.nextDouble();
        double perimeter = Length * 4;
        System.out.println("  ");
        System.out.println("The perimeter of the rhombus is: " + perimeter);
    }

    static void TriangleP(Scanner input) {
        System.out.print("Enter the measurement of the 1st side: ");
        double First = input.nextDouble();
        System.out.print("Enter the measurement of the 2nd side: ");
        double Second = input.nextDouble();
        System.out.print("Enter the measurement of the 3rd side: ");
        double Third = input.nextDouble();
        double perimeter = First + Second + Third;
        System.out.println("  ");
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }

    static void TrapezoidP(Scanner input) {
        System.out.print("Enter the measurement of the 1st side: ");
        double First = input.nextDouble();
        System.out.print("Enter the measurement of the 2nd side: ");
        double Second = input.nextDouble();
        System.out.print("Enter the measurement of the 3rd side: ");
        double Third = input.nextDouble();
        System.out.println("Enter the measurement of the 4th side: ");
        double Fourth = input.nextDouble();
        double perimeter = First + Second + Third + Fourth;
        System.out.println("  ");
        System.out.println("The perimeter of the trapezoid is: " + perimeter);
    }

    static void CirclrP(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        double ans = (2 * Math.PI) * radius;
        System.out.println("  ");
        System.out.println("The circumference of the Circle is: " + ans);
    }

    static void NagonP(Scanner input) {
        System.out.print("Enter the measurement of the length of the side of the Polygon: ");
        double Length = input.nextDouble();
        System.out.print("Enter the no. of side of the polygon: ");
        double Side = input.nextDouble();
        double ans = Length * Side;
        System.out.println("  ");
        System.out.println("The perimeter of the polygon is: " + ans);
    }

    static void RectangleA(Scanner input) {
        System.out.print("Enter the measurement of the length: ");
        double Length = input.nextDouble();
        System.out.print("Enter the measurement of the width: ");
        double Width = input.nextDouble();
        double ans = Length * Width;
        System.out.println("  ");
        System.out.println("The area of the recatangle is: " + ans);
    }

    static void SquareA(Scanner input) {
        System.out.print("Enter the measurement of the side of the square: ");
        double Length = input.nextDouble();
        double ans = Length * Length;
        System.out.println("  ");
        System.out.println("The area of the square is: " + ans);
    }

    static void TriangleA(Scanner input) {
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        System.out.print("Enter the measurement of the base: ");
        double base = input.nextDouble();
        double ans = (height * base) * (1.0 / 2.0);
        System.out.println("  ");
        System.out.println("The area of the triangle is: " + ans);
    }

    static void RhombusA(Scanner input) {
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        System.out.print("Enter the measurement of the base: ");
        double base = input.nextDouble();
        double ans = (height * base);
        System.out.println("  ");
        System.out.println("The area of the Rhombus/parallegram is: " + ans);
    }
    
     static void ParallelogramA(Scanner input) {
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        System.out.print("Enter the measurement of the base: ");
        double base = input.nextDouble();
        double ans = (height * base);
        System.out.println("  ");
        System.out.println("The area of the Rhombus/parallegram is: " + ans);
    }

    static void TrapezoidA(Scanner input) {
        System.out.print("Enter the measurement of the Top Side: ");
        double Topside = input.nextDouble();
        System.out.print("Enter the measurement of the Bottom side: ");
        double Botside = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = ((Topside * Botside) / 2) * height;
        System.out.println("  ");
        System.out.println("The area of the Trapezoid is: " + ans);
    }

    static void CircleA(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        double ans = Math.PI * (radius * radius);
        System.out.println("  ");
        System.out.println("The area of the Rhombus/parallegram is: " + ans);
    }

    static void SphereV(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double Radius = input.nextDouble();
        double ans = ((4.0 / 3.0) * Math.PI) * (Radius * Radius * Radius);
        System.out.println("  ");
        System.out.println("The volume of the sphere is: " + ans);
    }

    static void CylinderV(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = (Math.PI * (radius * radius)) * height;
        System.out.println("  ");
        System.out.println("The volume of the cylinder is: " + ans);
    }

    static void CubeV(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double side = input.nextDouble();
        double ans = side * side * side;
        System.out.println("  ");
        System.out.println("The volume of the cube is: " + ans);
    }

    static void ConeV(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double Radius = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = ((1.0 / 3.0) * Math.PI) * (Radius * Radius) * height;
        System.out.println("  ");
        System.out.println("The volume of the cone is: " + ans);
    }

    static void CuboidV(Scanner input) {
        System.out.print("Enter the measurement of the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the measurement of the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = length * base * height;
        System.out.println("  ");
        System.out.println("The volume of the cuboid is: " + ans);
    }

    static void SphereSA(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        double ans = (4.0 * Math.PI) * (radius * radius);
        System.out.println("  ");
        System.out.println("The total surface area of sphere is: " + ans);
    }

    static void CubeSA(Scanner input) {
        System.out.print("Enter the measurement of the side: ");
        double length = input.nextDouble();
        double ans = length * 6;
        System.out.println("  ");
        System.out.println("The total surface area of the cube is: " + ans);
    }

    static void ConeSA(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the measurement of the slant height: ");
        double slantheight = input.nextDouble();
        double ans = (Math.PI * radius) * (radius * slantheight);
        System.out.println("  ");
        System.out.println("The total surface area of the cone is: " + ans);
    }

    static void CylinderSA(Scanner input) {
        System.out.print("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = ((2.0 * Math.PI) * radius) * (radius * height);
        System.out.println("  ");
        System.out.println("The total surface area of the cylinder is: " + ans);
    }

    static void CuboidSA(Scanner input) {
        System.out.print("Enter the measurement of the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the measurement of the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the measurement of the height: ");
        double height = input.nextDouble();
        double ans = 2 * (length * width * height);
        System.out.println("  ");
        System.out.println("The total surface area of the cuboid is: " + ans);
    }

    static void Enter() {
        System.out.println("  ");
        System.out.print("Please Enter a number of your choice: ");
    }

    static void Enter2() {
        System.out.println("");
        System.out.print("Do you want another calculations? (yes or no): ");
    }

    static void Space() {
        System.out.println("");
    }
}
