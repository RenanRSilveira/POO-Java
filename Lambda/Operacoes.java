package Lambda;

public class Operacoes {
    public static void main(String[] args) {
        /*  Modo convencional, bastante verboso 
         */
        Operacao soma = new Operacao() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }

        };
        System.out.println("Soma sem lambda: " + soma.calcular(2, 4));

        /* Modo Lambda
         */

         Operacao somaLambda = (a, b) -> a + b;
         Operacao multiplicar = (a, b) -> a * b;
         System.out.println("Soma com Lambda: " + somaLambda.calcular(3, 5));
         System.out.println("Multiplicação com lambda: " + multiplicar.calcular(2, 6));

    }
}

interface Operacao{
    int calcular(int a, int b);
}