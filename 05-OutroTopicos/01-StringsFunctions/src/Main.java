public class Main {
    public static void main(String[] args){
        String frase = " Olho por olho dente por dente e acabaremos em um mundo cego ";
        System.out.println(frase);
        System.out.println(frase.charAt(4));
        System.out.println(frase.trim());
        System.out.println(frase.indexOf("dente"));
        System.out.println(frase.lastIndexOf("dente"));
        System.out.println(frase.replace("por", "#"));
        String[] palavras = frase.trim().split(" ");
        System.out.println(palavras.length);
        System.out.println(palavras[1]);
        for(String palavra : palavras){
            System.out.println(palavra);
        }
    }
}