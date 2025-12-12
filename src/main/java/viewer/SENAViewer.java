package viewer;

import java.util.ArrayList;

public class SENAViewer {

    private ArrayList<Contenido> biblioteca = new ArrayList<>();

    public SENAViewer() {
        // Datos de ejemplo
        biblioteca.add(new Pelicula("Avatar", "Ciencia ficción", 162, "James Cameron"));
        biblioteca.add(new Pelicula("Titanic", "Drama", 195, "James Cameron"));
        biblioteca.add(new Serie("Breaking Bad", "Crimen", 50, 5));
        biblioteca.add(new Serie("Dark", "Misterio", 45, 3));
    }

    public void mostrarBiblioteca() {
        System.out.println("\n===== CONTENIDO DISPONIBLE =====");
        int i = 1;
        for (Contenido c : biblioteca) {
            System.out.println(i + ". " + c.getTitulo() + (c.isVisto() ? " (Visto)" : ""));
            i++;
        }
    }

    public void reproducir(int index) {
        if (index < 1 || index > biblioteca.size()) {
            System.out.println("Opción inválida.");
            return;
        }

        Contenido contenido = biblioteca.get(index - 1);
        contenido.reproducir();
        contenido.marcarVisto();
    }

    public void verDetalles(int index) {
        if (index < 1 || index > biblioteca.size()) {
            System.out.println("Opción inválida.");
            return;
        }
        biblioteca.get(index - 1).mostrarInfo();
    }
}
