package Figuras;
public abstract class Regulares extends Figuras2D{
    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }

    @Override
    public double calcularArea(double lado1, double lado2, double lado3) {
        return 0;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        return 0;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2) {
        return 0;
    }

    @Override
    public double calcularArea(double diagonal1, double diagonal2) {
        return 0;
    }
}


