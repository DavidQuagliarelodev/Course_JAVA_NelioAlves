package application.service;

public class CompareLargeAreaTriangle {

    public void compare(double areaTriangleX, double areaTriangleY){
        if(areaTriangleX > areaTriangleY){
            System.out.println("TriangleX Large!: " + areaTriangleX);
            System.out.println("TriangleY Large!: " + areaTriangleY);
            System.out.println("Winer !: " + "X");
        }else{
            System.out.println("TriangleX Large!: " + areaTriangleX);
            System.out.println("TriangleY Large!: " + areaTriangleY);
            System.out.println("Winer !: " + "Y");
        }
    }
}
