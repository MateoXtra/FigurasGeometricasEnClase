package Figuras;

public class Figuras2D extends FigurasGeometricas {
    int nLados;

    public Figuras2D() {
    }

    public Figuras2D(int nLados, String nombre) {
        super(nLados, nombre);
        this.nLados = nLados;
    }

    public int getNLados() {
        return nLados;
    }



    @Override
    public void mostrar_datos() {
        System.out.println("Figuras Geométricas 2D");
        System.out.println("Número de lados: " + this.getNLados());
        System.out.println("Área: " + this.calcularÁrea());
    }

    public static class Regulares {
        public static class Cuadrilateros extends Figuras2D {
            private double lado1;
            private double lado2;

            public Cuadrilateros(double lado1, double lado2) {
                super(4, "Cuadrilátero");
                this.lado1 = lado1;
                this.lado2 = lado2;
            }

            public double getLado1() {
                return lado1;
            }

            public void setLado1(double lado1) {
                this.lado1 = lado1;
            }

            public double getLado2() {
                return lado2;
            }

            public void setLado2(double lado2) {
                this.lado2 = lado2;
            }

            @Override
            public double calcularÁrea() {
                return lado1 * lado2;
            }
        }

        public static class Triangulos extends Figuras2D {
            private double base;
            private double altura;

            public Triangulos(double base, double altura) {
                super(3, "Triángulos");
                this.base = base;
                this.altura = altura;
            }

            public double getBase() {
                return base;
            }

            public void setBase(double base) {
                this.base = base;
            }

            public double getAltura() {
                return altura;
            }

            public void setAltura(double altura) {
                this.altura = altura;
            }

            @Override
            public double calcularÁrea() {
                return (base * altura) / 2;
            }
        }
    }
}
