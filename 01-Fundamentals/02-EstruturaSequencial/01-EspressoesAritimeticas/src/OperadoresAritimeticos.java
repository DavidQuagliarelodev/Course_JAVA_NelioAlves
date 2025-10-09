public class OperadoresAritimeticos {
    public void somar(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }

    public void subtrair(int a, int b) {
        System.out.println("Subtracao: " +   (a - b));
    }

    public void multiplicar(int a, int b) {
        System.out.println("Multipiicacao: " +   (a * b));
    }

    public void dividir(int a, int b) {
        System.out.println("Divisao: " +   (a / b));
    }

    public void modulo(int a, int b) {
        System.out.println("Modulo: " +   (a % b));
    }

    public void incrementar(int a) {
        System.out.println("Incremento: " +   (++a));
    }

    public void decrementar(int a) {
        System.out.println("Decremento: " +   (--a));
    }

    public void executeAllOperations(int a, int b) {
        this.somar(a, b);
        this.subtrair(a, b);
        this.multiplicar(a, b);
        this.dividir(a, b);
        this.modulo(a, b);
        this.incrementar(a);
        this.decrementar(a);
    }
}
