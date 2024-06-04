package Figuras;
public abstract class Figuras2D extends FigurasGeometricas{
    double área, perímetro;
    public Figuras2D() {
    }
    public Figuras2D(int nLados, String nombre, double área, double perímetro) {
        super(nLados, nombre);
        this.área = área;
        this.perímetro = perímetro;
    }
    public double getÁrea() {
        return área;
    }
    public void setÁrea(double área) {
        this.área = área;
    }
    public double getPerímetro() {
        return perímetro;
    }
    public void setPerímetro(double perímetro) {
        this.perímetro = perímetro;
    }
    public double calcularÁrea(double lado1, double lado2){
        double área=lado1*lado2;
        return área;
    }
    @Override
    public void mostrar_datos() {
        System.out.println("Figuras Geométricas 2D");
        System.out.println("Área:"+this.getÁrea());
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}