package POO009.classes;

public class Quadrado implements FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    };

    public double calcularArea() {
        return (lado * lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
