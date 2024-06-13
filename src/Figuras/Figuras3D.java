package Figuras;

import java.util.Scanner;

public class Figuras3D extends FigurasGeometricas{

    public Double PI = Math.PI;

    Double lado;
    Double radio;
    Double altura;


    public Figuras3D() {
    }
    public Figuras3D(int nLados, String nombre, Double lado, Double radio, Double altura) {
        super(nLados, nombre);
        this.lado = lado;
        this.radio = radio;
        this.altura = altura;
    }



    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double generatriz(){
        Double valor = Math.sqrt(Math.pow(altura,2) + Math.pow(radio,2));
        return valor;
    }
    public double calcularArea(String nombre) {
        switch (nombre) {
            case "Cubo":
                return 6 * Math.pow(lado, 2);
            case "Esfera":
                return 4 * PI * Math.pow(radio, 2);
            case "Cilindro":
                return 2 * PI * radio * (radio + altura);
            case "Cono":
                return PI * radio * (radio + generatriz());
            default:
                return 0.0;
        }
    }

    public double calcularVolumen(String nombre) {
        switch (nombre) {
            case "Cubo":
                return Math.pow(lado, 3);
            case "Esfera":
                return 0.75 * PI * Math.pow(radio, 3);
            case "Cilindro":
                return PI * Math.pow(radio, 2) * altura;
            case "Cono":
                return 1/3 * PI * Math.pow(radio, 2) * altura;
            default:
                return 0.0;
        }
    }

    public void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("FIGURAS GEOMETRICAS 3D");
        System.out.println("1. Cubo");
        System.out.println("2. Esfera");
        System.out.println("3. Cilindro");
        System.out.println("4. Cono");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            setNombre("Cubo");
            System.out.println("AREA");
            System.out.println("Escribe la longitud de la cara del Cubo: ");
            setLado(sc.nextDouble());
            System.out.println("Area Cubo: " + calcularArea("Cubo"));
            System.out.println("---------------------------------------------");
            System.out.println("VOLUMEN");
            System.out.println("Escribe la longitud de la cara del Cubo: ");
            setLado(sc.nextDouble());
            System.out.println("Volumen Cubo: " + calcularVolumen("Cubo"));
            System.out.println("---------------------------------------------");
        } else if (opcion == 2) {
            setNombre("Esfera");
            System.out.println("AREA");
            System.out.println("Escribe el radio de la Esfera: ");
            setRadio(sc.nextDouble());
            System.out.println("Area Esfera: " + calcularArea("Esfera"));
            System.out.println("---------------------------------------------");
            System.out.println("VOLUMEN");
            System.out.println("Escribe el radio de la Esfera: ");
            setRadio(sc.nextDouble());
            System.out.println("Volumen Esfera: " + calcularVolumen("Esfera"));
            System.out.println("---------------------------------------------");
        } else if (opcion == 3) {
            setNombre("Cilindro");
            System.out.println("AREA");
            System.out.println("Escribe la altura del Cilindro: ");
            setAltura(sc.nextDouble());
            System.out.println("Escribe el radio del Cilindro: ");
            setRadio(sc.nextDouble());
            System.out.println("Area Cilindro: " + calcularArea("Cilindro"));
            System.out.println("---------------------------------------------");
            System.out.println("VOLUMEN");
            System.out.println("Escribe la altura del Cilindro: ");
            setAltura(sc.nextDouble());
            System.out.println("Escribe el radio del Cilindro: ");
            setRadio(sc.nextDouble());
            System.out.println("Volumen Cilindro: " + calcularVolumen("Cilindro"));
            System.out.println("---------------------------------------------");
        } else if (opcion == 4) {
            setNombre("Cono");
            System.out.println("AREA");
            System.out.println("Escribe la altura del Cono: ");
            setAltura(sc.nextDouble());
            System.out.println("Escribe el radio del Cono: ");
            setRadio(sc.nextDouble());
            generatriz();
            System.out.println("Area Cono: " + calcularArea("Cilindro"));
            System.out.println("---------------------------------------------");
            System.out.println("VOLUMEN");
            System.out.println("Escribe la altura del Cono: ");
            setAltura(sc.nextDouble());
            System.out.println("Escribe el radio del Cono: ");
            setRadio(sc.nextDouble());
            System.out.println("Volumen Cono: " + calcularVolumen("Cilindro"));
            System.out.println("---------------------------------------------");
        } else if (opcion == 5) {
            System.out.println("Saliendo de Figuras 3D");
        } else {
            System.out.println("Opción no válida");
        }

    }


    @Override
    public void mostrar_datos(){
        System.out.println("Figuras Geometricas 3D");
        System.out.println("Nombre:  " + getNombre());
        System.out.println("Area:  " + calcularArea(Nombre));
        System.out.println("Volumen:  " + calcularVolumen(Nombre));
    }
}
