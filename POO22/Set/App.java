package POO22.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // -> Set é usado quando você quer evitar repetição de itens na lista
        //   .HashSet não garante ordem
        //   .LinkedHashSet gartante ordem

        Set<String> nomes = new LinkedHashSet<>();

        nomes.add("Renan");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Carlos"); // *
        nomes.add("Bruno");
        nomes.add("Carlos"); // Ignorado

        System.out.println(nomes);
    }
}
