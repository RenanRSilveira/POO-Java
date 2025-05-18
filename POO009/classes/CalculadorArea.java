package POO009.classes;

public class CalculadorArea {
    public double somarAreas(FiguraGeometrica quadrado, FiguraGeometrica circulo) {
        double totalArea = quadrado.calcularArea() + circulo.calcularArea();
        return totalArea;
    }
}
