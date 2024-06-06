package Figuras;
public abstract class Figuras2D extends FigurasGeometricas{
    @Override
    public void mostrar_datos() {
        System.out.println("Figuras Geométricas 2D");
    }
    public abstract double calcularArea(double lado1, double lado2, double lado3);
    public abstract double calcularPerimetro(double lado1, double lado2, double lado3);
    public abstract double calcularPerimetro(double lado1, double lado2);
    public abstract double calcularArea(double diagonal1, double diagonal2);
}