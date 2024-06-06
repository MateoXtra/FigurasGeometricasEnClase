package Figuras;
public class Hexagono extends Regulares{
        double longitudLado;
        public Hexagono() {
        }
        public Hexagono(double longitudLado) {
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
            return ((3*Math.sqrt(3))/2*Math.pow(longitudLado, 2));
        }
        @Override
        public double calcularPerimetro(){
            return 6*longitudLado;
        }
}
