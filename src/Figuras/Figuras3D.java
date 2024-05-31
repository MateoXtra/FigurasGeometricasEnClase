package Figuras;

public class Figuras3D {
    int numCaras;
    Double numArista;

    public Figuras3D() {
    }

    public Figuras3D(int numCaras, Double numArista) {
        this.numCaras = numCaras;
        this.numArista = numArista;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public Double getNumArista() {
        return numArista;
    }

    public void setNumArista(Double numArista) {
        this.numArista = numArista;
    }

    public void CalcularVolumen(){
        Double volume = numCaras * numArista;
    }

}
