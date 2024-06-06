package Figuras;
public class Heptagono extends Regulares{
    double longitudLado;
    public Heptagono() {
    }
    public Heptagono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    @Override
    public double calcularArea(){
        return 3.6339*Math.pow(longitudLado, 2);
    }
    @Override
    public double calcularPerimetro(){
        return 7*longitudLado;
    }
}
