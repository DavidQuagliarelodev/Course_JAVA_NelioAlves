package application;

import application.service.CalculateCircumference;
import application.service.CalculateVolumeInCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Constants
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raio in Circumference: ");
        double radius = sc.nextDouble();
        System.out.println("Circumference: " + CalculateCircumference.calculate(radius));
        System.out.println("Volume: " + CalculateVolumeInCircle.calculate(radius));
        System.out.println("PI: " + String.format("%.2f", Math.PI));
    }
}