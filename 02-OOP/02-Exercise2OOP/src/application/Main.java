package application;

import application.entities.Product;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Product product = new Product();
    System.out.print("Add Name product:");
    product.setName(sc.next());

    System.out.print("Add Price in product:");
    product.setPrice(sc.nextDouble());

    System.out.print("Add quantity product:");
    product.addProducts(sc.nextInt());

    System.out.print("Remove quantity product:");
    product.removeProducts(sc.nextInt());

    System.out.println("R$:" + product.totalValueInStock());
    //Ato inferindo o toString() que eu implementei
    //System.out.println(product);

    //Is great method for compare
    System.out.println(product.equals(sc));
}
}