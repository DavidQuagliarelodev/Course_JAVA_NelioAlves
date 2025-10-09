public class Main {
    public static void main(String args[ ]){
        int a = 10;
        //Ternario serve pra uma expressao simples com apenas dois resultados provaveis
        //onde pode economizar muitas linhas de codigo caso utilizasse if else
       String result = (a >= 20) ? "Verdadeiro" : "Falso";
        System.out.println(result);
    }
}
