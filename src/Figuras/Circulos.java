package Figuras;

public class Circulos extends Regulares{
    double radio;

    public Circulos(){
    }

    public Circulos(double radio){
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Calcualr area del circulo
    public double calcularArea_Circulo() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Calcular perimetro del circulo
    public double calcularPerimetro_Circulo() {
        return 2 * Math.PI * radio;

    }
}


