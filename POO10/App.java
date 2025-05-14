package POO10;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayDinamico = new ArrayList<>();

        arrayDinamico.add("Goku");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Vegeta");
        arrayDinamico.add("Bob Esponja");

        System.out.println(arrayDinamico.size());

        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }
        System.out.println();

        for (String x : arrayDinamico) {
            System.out.println(x);
        }
    }
}
