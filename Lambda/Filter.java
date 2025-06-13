package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        lista.add(5);
        System.err.println(lista);
        /* O método filter() retorna um novo Stream contendo 
        *  somente os elementos que satisfazem a condição.
        *  stream.filter(elemento -> condição);
        *  .toList();  
        */ 

        List<Integer> filtrados = lista.stream().filter(n -> n > 3 ).toList();       
        System.out.println(filtrados);

    }
}
