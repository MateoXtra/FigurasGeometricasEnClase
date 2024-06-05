package Figuras;

public class Triangulo extends Regulares{
    double base;
    double altura;
    double hipotenusa;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return base+altura+hipotenusa;
    }
}
