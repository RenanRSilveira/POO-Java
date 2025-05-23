package POO22.Deque;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /* Fila de dois lados: Permite inserir e remover elementos tanto no início quanto
           no final da estrutura.
         * addFirst(e); addLast(e); removerFirst(e); peekFirst(); peekLast(consulta o último);
         * push(insere no topo, igual pilha); pop() e pool() são praticamente iguais;
         * -> Quando usar?
         *  .Processar tarefas em ordem, filas de impressão, atendimento, processamento assíncrono
        */

        Deque<String> frutas = new ArrayDeque<>();

        frutas.add("Abacate");
        frutas.add("Banana");
        frutas.add("Cereja");
        frutas.add("Damasco");

        System.out.println("Topo: " + frutas.peek());
        System.out.println(frutas);
        System.out.println(frutas.pop());
        System.out.println(frutas);
    }
}
