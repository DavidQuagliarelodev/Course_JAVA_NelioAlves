public class Main {
    public static void main(String args[ ]){
        //Estrutura Condional Simples(if) + Composta(if else) + Estrutural(if else if else)
        int idade = 90;
        int idadeParaVotar = 18;

        //Votacao opcional
        if(idade >= 16 && idade < 18){
            System.out.println("Sua Votacao e Opcional! ");
        } else if (idade >= 18 && idade < 80) {
            System.out.println("Sua Votacao e Obrigatoria");
        }else if (idade >= 80 ){
            System.out.println("Vc esta Isendo de Obrigatoriade de votacao");
        }else{
            System.out.println("Vc e menor de idade e nao pode votar");
        }

    }
}


