package application.service;

public class CalculateCircumference {

    public static String calculate (double raio){
        double circumference = 2 * Math.PI * raio;
        return String.format("%.2f", circumference);
    }
}
