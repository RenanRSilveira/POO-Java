package POO16;

import POO16.Classes.Carro;
import POO16.Classes.Matematica;

public class App {
    public static void main(String[] args) {
        System.out.println(Matematica.somar(10, 5));
        System.out.println(Matematica.calcularAreaCirculo(3));
        System.out.println(Matematica.calcularAreaQuadrado(2));
        System.out.println();

        Carro ferrari = new Carro("Ferrari", 2025);
        Carro fusca = new Carro("Fusca", 1975);
        System.out.println(ferrari.anoCompra);
        System.out.println(fusca.anoCompra);
        System.out.println(Carro.anoCompra);

        ferrari.anoCompra = 2026;
        System.out.println(fusca.anoCompra);

    }
}
