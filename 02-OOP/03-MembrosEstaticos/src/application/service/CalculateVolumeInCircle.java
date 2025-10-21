package application.service;

public class CalculateVolumeInCircle {

    public static String calculate (double raio){
        double volumeC = ((double) 4 / 3) * Math.PI * Math.pow(raio, 3);
        return String.format("%.2f", volumeC);
    }
}
