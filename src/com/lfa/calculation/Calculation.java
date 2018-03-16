package com.lfa.calculation;
import java.util.Scanner;
public class Calculation{
    static float l, b, h, r, a, v, p;
    static Scanner sc = new Scanner(System.in);

    public static void calculateVolumeOfCube(){
        System.out.println("Enter the length");
        l = sc.nextFloat();
        v = l*l*l;
        System.out.println("The volume = "+v);

    }
    public static void calculateVolumeOfCuboid(){
        System.out.println("Enter the length");
        l = sc.nextFloat();
         System.out.println("Enter the breadth");
        b = sc.nextFloat();
        System.out.println("Enter the height");
        h = sc.nextFloat();
        v = l*b*h;
        System.out.println("The volume = "+v);

    }
    public static void calculatePerimeterOfRectangle(){
         System.out.println("Enter the length");
        l = sc.nextFloat();
         System.out.println("Enter the breadth");
        b = sc.nextFloat();
        p = 2*(l+b);
        System.out.println("The perimeter = "+p);
    }
    public static void calculateAreaOfRectangle(){
        System.out.println("Enter the length");
        l = sc.nextFloat();
         System.out.println("Enter the breadth");
        b = sc.nextFloat();
        a = l*b;
        System.out.println("The perimeter = "+a);
    }
    public static void main (String []args){
        calculateAreaOfRectangle();
        calculatePerimeterOfRectangle();
        calculateVolumeOfCube();
        calculateVolumeOfCuboid();
    }
    
}