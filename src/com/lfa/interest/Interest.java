package com.lfa.interest;
import java.util.Scanner;
public class Interest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time:");
        double time = sc.nextDouble();
        System.out.println("Enter the rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter the principal amt:");
        double principal = sc.nextDouble();
        double interest = (principal*time*rate)/100;
        System.out.println("The interest = "+interest);
    }
}