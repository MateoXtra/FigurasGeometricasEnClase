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
    public double calcularÁrea(){
        return 4.8284*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 8*longitudLado;
    }
}
