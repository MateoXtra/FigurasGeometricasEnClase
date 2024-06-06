package Figuras;
public class Figuras_irregulares extends Figuras2D{
    //4 figuras geométricas irregulares definidas

    //triángulo escaleno (área y perímetro)
    @Override
    public double calcularArea(double lado1, double lado2, double lado3){
        double area=Math.sqrt(((lado1+lado2+lado3)/2)*(((lado1+lado2+lado3)/2)-lado1)*(((lado1+lado2+lado3)/2)-lado2)*(((lado1+lado2+lado3)/2)-lado3));
        return area;
    }
    @Override
    public double calcularPerimetro(double lado1, double lado2, double lado3){
        double perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    //trapecio (área y perímetro)
    public double areaTrapecio(double lado1, double lado2, double altura){
        double area=((lado1+lado2)*altura)/2;
        return area;
    }
    @Override
    public double calcularPerimetro(double lado1, double lado2){
        double perimetro=(2*lado1)+(2*lado2);
        return perimetro;
    }
    //paralelogramo (área y perímetro)
    @Override
    public double calcularArea(double base, double altura){
        double area=base*altura;
        return area;
    }
    public double perimetroParalelogramo(double lado1, double lado2){
        double perimetro=2*(lado1+lado2);
        return perimetro;
    }
    //cometa o deltoide (área y perímetro)
    public double areaDeltoide(double diagonal1, double diagonal2) {
        double area = (diagonal1 * diagonal2) / 2;
        return area;
    }
    public double perimetroDeltoide(double lado1, double lado2){
        double perimetro=2*(lado1+lado2);
        return perimetro;
    }
}
