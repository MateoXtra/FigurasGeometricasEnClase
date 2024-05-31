import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Seleccion de Figura Geometrica");
            System.out.println("2. Salir");
            System.out.println("Ingrese opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("1.Figuras 2D");
                    System.out.println("1.Figuras 3D");

            }
        }while (opcion != 2);


    }
}