package POO09.classes;

public class Circulo implements FiguraGeometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * (raio * raio));
    }

}
