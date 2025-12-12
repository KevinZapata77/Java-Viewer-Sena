package viewer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        SENAViewer app = new SENAViewer();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SENA VIEWER =====");
            System.out.println("1. Ver contenido disponible");
            System.out.println("2. Reproducir contenido");
            System.out.println("3. Ver detalles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> app.mostrarBiblioteca();
                case 2 -> {
                    System.out.print("Ingrese el número del contenido: ");
                    app.reproducir(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Ingrese el número del contenido: ");
                    app.verDetalles(sc.nextInt());
                }
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
