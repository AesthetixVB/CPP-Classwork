/**
Maria Trezha Von Bargen
CS1400
Section 3
Assignment 3
Date: 06/12/2024
*/

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        String captureID;
        double redValue;
        double nirValue;

        // Create a Scanner object to read input.
        Scanner scanner = new Scanner(System.in);

        // Get the capture ID from the user.
        System.out.print("Enter capture ID: ");
        captureID = scanner.nextLine();

        // Get the red band value from the user.
        System.out.print("Enter red band value: ");
        redValue = scanner.nextDouble();

        // Get the NIR band value from the user.
        System.out.print("Enter NIR band value: ");
        nirValue = scanner.nextDouble();

        // Calculate NDVI
        double ndvi = (nirValue - redValue) / (nirValue + redValue);

        // Print out everything
        System.out.println(" "); // wanted to add a space between the input lines and output lines
        System.out.println("Capture ID: " + captureID);
        System.out.println("Red band value: " + redValue);
        System.out.println("Near-infrared (NIR) band value: " + nirValue);
        System.out.println("Normalized Difference Vegetation Index (NDVI): " + ndvi);

    }
}