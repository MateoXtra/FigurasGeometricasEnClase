package Figuras;

public class Cuadrilatero extends Regulares {
    double lado1;
    double lado2;
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero() {
    }
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
