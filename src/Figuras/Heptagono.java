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
    public double calcularÁrea(){
        return 3.6339*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 7*longitudLado;
    }
}
