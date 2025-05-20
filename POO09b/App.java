package POO09b;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         try {
            System.out.println("Escolha o método de pagamento: 1 - Cartão | 2 - PayPal | 3 - Dinheiro");
            int opcao = scanner.nextInt();
            
            System.out.println("Digite o valor a ser pago:");
            double valor = scanner.nextDouble();
            
            Pagamento pagamento;

            switch (opcao) {
                case 1: pagamento = new CartaoCredito(); break;
                case 2: pagamento = new PayPal(); break;
                case 3: pagamento = new Dinheiro(); break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }
    
            pagamento.processarPagamento(valor);
            scanner.close();
            
        } catch (Exception e) {
            System.out.println("Erro");
        }

        

    }

}


interface Pagamento {
    void processarPagamento(double valor);
}

class CartaoCredito implements Pagamento{

    public void processarPagamento(double valor){
        System.out.printf("Pagando %.2f com o Cartão de crédito", valor);
    }
}

class PayPal implements Pagamento{

    public void processarPagamento(double valor){
        System.out.printf("Pagando %.2f com o PayPal", valor);
    }
}

class Dinheiro implements Pagamento{

    public void processarPagamento(double valor){
        System.out.printf("Pagando %.2f com dinheiro", valor);
    }
}