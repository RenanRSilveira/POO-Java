package POO22.Queue;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /* Fila: Primeiro a entrar, primeiro a sair (FIFO)
         * fila.pool.(remove o primeiro item)
         * -> Quando usar?
         *  .Processar tarefas em ordem, filas de impressão, atendimento, processamento assíncrono
        */

        Queue<String> frutas = new LinkedList<>();

        frutas.add("Abacate");
        frutas.add("Banana");
        frutas.add("Cereja");
        frutas.add("Damasco");

        System.out.println("Topo: " + frutas.peek());
        System.out.println(frutas);
        System.out.println(frutas.poll());
        System.out.println(frutas);
    }
}
