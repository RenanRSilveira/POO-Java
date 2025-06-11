package POO22.GenericsCollections;

import java.util.LinkedList;
import java.util.Queue;

public class App {
   public static void main(String[] args) {
        // Caixa de String
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Java é top!");
        System.out.println("Texto da caixa: " + caixaTexto.abrir());

        // Caixa de Integer
        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(2025);
        System.out.println("Número da caixa: " + caixaNumero.abrir());

        // Caixa de Double
        Caixa<Double> caixaDecimal = new Caixa<>();
        caixaDecimal.guardar(3.1415);
        System.out.println("Decimal da caixa: " + caixaDecimal.abrir());

        // Generic Queue
        Fila<Integer> numeros = new Fila<>();

        numeros.adicionar(1);
        numeros.adicionar(10);
        numeros.adicionar(100);

        numeros.listar();
        
    }
}

class Caixa<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T abrir() {
        return conteudo;
    }
}

class Fila<T> {

    private Queue<T> fila = new LinkedList<>();

    public void adicionar(T item) {
        fila.add(item);
    }

    public void listar() {
        for (T x : fila) {
            System.out.println(x);
        }
    }
}
