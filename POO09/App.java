package POO09;

import POO09.classes.Circulo;
import POO09.classes.Quadrado;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(3);
        System.out.println(quadrado.calcularArea());

        Circulo circulo = new Circulo(2);
        System.out.println(circulo.calcularArea());
    }
}
