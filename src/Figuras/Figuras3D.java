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


    // CALCULOSS ------------------------------------- //

    public Double generatriz(){
        Double valor = Math.sqrt(Math.pow(altura,2) + Math.pow(radio,2));
        return valor;
    }

    //CUBO//
    public Double CalcularAreaCubo(){
        setnLados(6);
        Double area = nLados * Math.pow(lado, 2);
        return area;
    }
    public Double CalcularVolumenCubo(){
        Double volumen = Math.pow(lado, 3);
        return volumen;
    }

    //ESFERA//
    public Double CalcularAreaEsfera(){
        Double area = 4 * PI * Math.pow(radio,2);
        return area;
    }
    public Double CalcularVolunenEsfera(){
        Double volumen = 3/4 * PI * Math.pow(radio,3);
        return volumen;
    }

    //CILINDRO
    public Double CalcularAreaCilindro(){
        Double area = 2 * PI * radio * (radio + altura);
        return area;
    }
    public Double CalcularVolunenCilindro(){
        Double volumen = PI * Math.pow(radio,2) * altura;
        return volumen;
    }

    //CONO
    public Double CalcularAreaCono(){
        Double area = PI * radio * (radio + generatriz());
        return area;
    }
    public Double CalcularVolunenCono(){
        Double volumen = 1/3 * PI * Math.pow(radio,2) * altura;
        return volumen;
    }

    public void Calcular() {
        System.out.println("¿Qué deseas calcular?");
        System.out.println("1. Area");
        System.out.println("2. Volumen");
        System.out.println("3. Retroceder");
        System.out.println("Seleccina una opcion; ");
    }

    // ------------------------------------- //

    public void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("FIGURAS GEOMETRICAS 3D");
            System.out.println("1. Cubo");
            System.out.println("2. Esfera");
            System.out.println("3. Cilindro");
            System.out.println("4. Cono");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int opcionFigura;
                    setNombre("Cubo");
                    do {
                        Calcular();
                        opcionFigura = sc.nextInt();
                        if (opcionFigura == 1){
                            System.out.println("Escribe la longitud de la cara del Cubo: ");
                            setLado(sc.nextDouble());
                            System.out.println("Area Cubo: " + CalcularAreaCubo());
                        } else if (opcionFigura == 2){
                            System.out.println("Escribe la longitud de la cara del Cubo: ");
                            setLado(sc.nextDouble());
                            System.out.println("Volumen Cubo: " + CalcularVolumenCubo());
                        } else if (opcionFigura == 3) {
                            System.out.println("Volviendo al Menu...");
                        } else {
                            System.out.println("Ingresa una opcion correcta");
                        }
                    } while (opcionFigura != 3);
                    break;
                case 2:
                    setNombre("Esfera");
                    int opcionFigura1;
                    do {
                        Calcular();
                        opcionFigura1 = sc.nextInt();
                        if (opcionFigura1 == 1){
                            System.out.println("Escribe el radio de la Esfera: ");
                            setRadio(sc.nextDouble());
                            System.out.println("Area Esfera: " + CalcularAreaEsfera());
                        } else if (opcionFigura1 == 2){
                            System.out.println("Escribe el radio de la Esfera: ");
                            setRadio(sc.nextDouble());
                            System.out.println("Volumen Esfera: " + CalcularVolunenEsfera());
                        } else if (opcionFigura1 == 3) {
                            System.out.println("Volviendo al Menu...");
                        } else {
                            System.out.println("Ingresa una opcion correcta");
                        }
                    } while (opcionFigura1 != 3);
                    break;
                case 3:
                    setNombre("Cilindro");
                    int opcionFigura2;
                    do {
                        Calcular();
                        opcionFigura2 = sc.nextInt();
                        if (opcionFigura2 == 1){
                            System.out.println("Escribe la altura del Cilindro: ");
                            setAltura(sc.nextDouble());
                            System.out.println("Escribe el radio del Cilindro: ");
                            setRadio(sc.nextDouble());
                            System.out.println("Area Cilindro: " + CalcularAreaCilindro());
                        } else if (opcionFigura2 == 2){
                            System.out.println("Escribe la altura del Cilindro: ");
                            setAltura(sc.nextDouble());
                            System.out.println("Escribe el radio del Cilindro: ");
                            setRadio(sc.nextDouble());
                            System.out.println("Volumen Cilindro: " + CalcularVolunenCilindro());
                        } else if (opcionFigura2 == 3) {
                            System.out.println("Volviendo al Menu...");
                        } else {
                            System.out.println("Ingresa una opcion correcta");
                        }
                    } while (opcionFigura2 != 3);
                    break;
                case 4:
                    setNombre("Cono");
                    int opcionFigura3;
                    do {
                        Calcular();
                        opcionFigura3 = sc.nextInt();
                        if (opcionFigura3 == 1) {
                            System.out.println("Escribe la altura del Cono: ");
                            setAltura(sc.nextDouble());
                            System.out.println("Escribe el radio del Cono: ");
                            setRadio(sc.nextDouble());
                            generatriz();
                            System.out.println("Area Cubo: " + CalcularAreaCono());
                        } else if (opcionFigura3 == 2){
                            System.out.println("Escribe la altura del Cono: ");
                            setAltura(sc.nextDouble());
                            System.out.println("Escribe el radio del Cono: ");
                            setRadio(sc.nextDouble());
                            System.out.println("Volumen Cubo: " + CalcularVolunenCono());
                        } else if (opcionFigura3 == 3) {
                            System.out.println("Volviendo al Menu...");
                        } else {
                            System.out.println("Ingresa una opcion correcta");
                        }
                    } while (opcionFigura3 != 3);
                    break;
                case 5:
                    System.out.println("Saliendo de Figuras Geometricas 3D");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }while (opcion != 5);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Figuras Geometricas 3D");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Area: " + CalcularAreaCubo());
        System.out.println("Volumen: " + CalcularVolumenCubo());
    }
}
