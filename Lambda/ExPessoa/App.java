package Lambda.ExPessoa;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList( 
        new Pessoa("A", 25),
        new Pessoa("B", 35),
        new Pessoa("C", 45),
        new Pessoa("D", 55)
        );

        List<Integer> idades = pessoas.stream().map(p -> p.getIdade()).toList();
        System.out.println(idades);
        
        List<Integer> idadesFiltradas = pessoas.stream()
            .map(Pessoa::getIdade).filter(i -> i > 35)
            .toList();

        System.out.println(idadesFiltradas);
    }
}
