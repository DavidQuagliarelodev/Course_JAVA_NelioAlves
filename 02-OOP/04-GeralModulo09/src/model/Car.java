package model;

public class Car {
    //Encapsulamento - Private (Acessado apenas atraves de getters and setters)
    private String name;
    private String brand;
    private String color;
    private String year;

    //Constructor
    public Car(){
    }

    //Sobrecarga - Ato de ter mais de um construtor com diferentes quantidades de parametros
    public Car(String name, String brand, String color, String year){
        //This e uma auto inferencia a propriedade do objeto instanciado
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    //Sobrecarga - Ato de ter mais de um construtor com diferentes quantidades de parametros
    public Car(String name, String brand){
        //This e uma auto inferencia a propriedade do objeto instanciado
        this.name = name;
        this.brand = brand;
    }

    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getBrand() + " " + this.getColor() + " " + this.getYear();
    }
}
