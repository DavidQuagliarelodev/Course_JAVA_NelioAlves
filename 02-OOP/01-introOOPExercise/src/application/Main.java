package application;

import application.entity.Triangle;
import application.service.CalculateLargeArea;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercise objective is calculate triangle area
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.print("EdgeX A : ");
        triangleX.setEdgeA(sc.nextDouble());
        System.out.print("EdgeX B : ");
        triangleX.setEdgeB(sc.nextDouble());
        System.out.print("EdgeX C : ");
        triangleX.setEdgeC(sc.nextDouble());

        System.out.print("EdgeY A : ");
        triangleY.setEdgeA(sc.nextDouble());
        System.out.print("EdgeY B : ");
        triangleY.setEdgeB(sc.nextDouble());
        System.out.print("EdgeY C : ");
        triangleY.setEdgeC(sc.nextDouble());
        sc.close();

        CalculateLargeArea calculateLargeArea = new CalculateLargeArea();
        calculateLargeArea.calculateArea(triangleX, triangleY);
    }
}
