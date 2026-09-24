/**
Maria Trezha Von Bargen
CS1400
Section 3
Assignment 3
Date: 06/12/2024
*/

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        
        int captures;
        double width;
        double height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of captures: ");
        captures = scanner.nextInt();

        System.out.print("Enter frame width: ");
        width = scanner.nextDouble();

        System.out.print("Enter frame height: ");
        height = scanner.nextDouble();

        //calculate Area of one frame
        double area = width * height;
        double total = captures * area;

        System.out.println(" ");
        System.out.println("Captures: " + captures);
        System.out.println("Area of one frame: " + area);
        System.out.println("Total area photographed: " + total);

    }
}