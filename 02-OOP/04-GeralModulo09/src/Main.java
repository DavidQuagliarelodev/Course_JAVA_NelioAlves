import model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Car car1 = new Car("Gol bola", "Wolgwagen", "Red", "2005");
         Car car2 = new Car("Onix", "SEiLA");
         Car car3 = new Car();

         car2.setColor("Green");
         car2. setYear("2020");

         car3.setName("Fusca");
         car3.setBrand("Pegot");
         car3.setColor("Blue");
         car3.setYear("1995");

        List<Car> carros = new ArrayList<>();
        carros.add(car1);
        carros.add(car2);
        carros.add(car3);

        for(Car car : carros){
            System.out.println(car.toString());
        }
    }
}