package application.entities;

public class Product {
    private String name;
    private double price;
    private int amountStok;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountStok() {
        return amountStok;
    }

    public void setAmountStok(int amountStok) {
        this.amountStok = amountStok;
    }

    public double totalValueInStock(){
        return this.amountStok * this.price;
    }

    public void addProducts(int quantity){
        this.amountStok += quantity;
        System.out.println("Updated: " + this.toString());
    }

    public void removeProducts(int quantity){
        this.amountStok -= quantity;
        System.out.println("Updated: " + this.toString());
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Value: R$" + String.valueOf(this.price) + " Amount: " + String.valueOf(this.amountStok);
    }
}
