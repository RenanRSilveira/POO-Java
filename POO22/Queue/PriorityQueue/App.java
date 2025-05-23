package POO22.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        /*/ É uma Queue que ordena os itens por ordem numérica ou ordem alfabética
        
        */

        Queue<Integer> filaPrioritaria = new PriorityQueue<>();
        Queue<String> filaPrioritaria2 = new PriorityQueue<>();
        
        filaPrioritaria.add(3);
        filaPrioritaria.add(5);
        filaPrioritaria.add(13);
        filaPrioritaria.add(33);

        System.out.println(filaPrioritaria);

        while (!filaPrioritaria.isEmpty()) {
            System.out.println("Senha: " + filaPrioritaria.poll());
        }

        filaPrioritaria2.add("Banana");
        filaPrioritaria2.add("Damasco");
        filaPrioritaria2.add("Abacate");
        filaPrioritaria2.add("Carambola");

        System.out.println(filaPrioritaria2);
        

    }
}
