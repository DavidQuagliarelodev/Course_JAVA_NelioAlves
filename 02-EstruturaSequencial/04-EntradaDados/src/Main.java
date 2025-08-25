import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale .setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Strings
        System.out.print("Digite seu nome: ");
        String name = sc.next();
        //int
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        //double
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        //char
        System.out.print("Digite seu sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
}
