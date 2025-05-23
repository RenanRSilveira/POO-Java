package POO22.Stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        /* Pilha: Primeiro a entrar, último a sair (LIFO)
         * pilha.clear(); pilha.empty(); pilha.peek(Mostra o ultimo item);
         * -> Quando usar?
         *  .Resolver problemas de recursão, desfazer/refazer (Ex: Ctrl+Z), análises de sintaxe,
         *   navegação (voltar em navegador)
        */

        Stack<String> frutas = new Stack<>();

        frutas.push("Abacate");
        frutas.push("Banana");
        frutas.push("Cereja");
        frutas.push("Damasco");

        System.out.println("Topo: " + frutas.peek());
        System.out.println(frutas);
        frutas.pop();
        System.out.println(frutas);
    }
}
