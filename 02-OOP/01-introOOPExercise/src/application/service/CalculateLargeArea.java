package application.service;

import application.entity.Triangle;

public class CalculateLargeArea {

    public void calculateArea(Triangle triangleX, Triangle triangleY){
        CalculateP calculateP = new CalculateP();
       double p = calculateP.calculate(triangleX);
       double areaTriangleX = Math.sqrt(p * (p - triangleX.getEdgeA()) * (p - triangleX.getEdgeB()) * (p - triangleX.getEdgeC()));
       p = calculateP.calculate(triangleY);
       double areaTriangleY = Math.sqrt(p * (p - triangleY.getEdgeA()) * (p - triangleY.getEdgeB()) * (p - triangleY.getEdgeC()));
       CompareLargeAreaTriangle compareLargeAreaTriangle = new CompareLargeAreaTriangle();
       compareLargeAreaTriangle.compare(areaTriangleX, areaTriangleY);

    }
}
