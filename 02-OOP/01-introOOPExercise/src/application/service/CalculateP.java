package application.service;

import application.entity.Triangle;

public class CalculateP {
    public double calculate(Triangle variableTriangle){
        double p = ((variableTriangle.getEdgeA() + variableTriangle.getEdgeB() + variableTriangle.getEdgeC()) / 2);
        return p;
    }
}
