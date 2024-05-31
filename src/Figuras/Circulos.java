package Figuras;

public class Circulos {
    Float radio;
    Float radio_cuadrado;

    public Circulos(){

    }
    public Circulos(Float radio, Float radio_cuadrado){
        this.radio = radio;
        this.radio_cuadrado = radio_cuadrado;
    }

    public Float getRadio() {
        return radio;
    }

    public Float getRadio_cuadrado() {
        return radio_cuadrado;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public void setRadio_cuadrado(Float radio_cuadrado) {
        this.radio_cuadrado = radio_cuadrado;
    }
    public void mostrar_datos_Circulo(){
        System.out.println("RADIO DE CIRCULO: " + radio);
        System.out.println("RADIO DE CIRCULO: " + radio_cuadrado);
    }
}
