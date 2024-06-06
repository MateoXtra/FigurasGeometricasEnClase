package Figuras;
public class Octagono extends Regulares{
    double longitudLado;
    public Octagono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public Octagono() {
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    @Override
    public double calcularArea(){
        return 4.8284*Math.pow(longitudLado, 2);
    }
    @Override
    public double calcularPerimetro(){
        return 8*longitudLado;
    }
}
