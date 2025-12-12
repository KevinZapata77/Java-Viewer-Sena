package viewer;

import java.util.ArrayList;

public class SENAViewer {

    private ArrayList<Contenido> biblioteca = new ArrayList<>();

    public SENAViewer() {
        // Datos de ejemplo
        biblioteca.add(new Pelicula("Avatar", "Ciencia ficción", 162, "James Cameron"));
        biblioteca.add(new Pelicula("Titanic", "Drama", 195, "James Cameron"));
        biblioteca.add(new Pelicula("Inception", "Ciencia ficción", 148, "Christopher Nolan"));
        biblioteca.add(new Pelicula("Interstellar", "Ciencia ficción", 169, "Christopher Nolan"));
        biblioteca.add(new Pelicula("The Dark Knight", "Acción", 152, "Christopher Nolan"));
        biblioteca.add(new Pelicula("Forrest Gump", "Drama", 142, "Robert Zemeckis"));
        biblioteca.add(new Pelicula("The Matrix", "Ciencia ficción", 136, "Lana y Lilly Wachowski"));
        biblioteca.add(new Pelicula("Gladiator", "Acción", 155, "Ridley Scott"));
        biblioteca.add(new Pelicula("The Godfather", "Crimen", 175, "Francis Ford Coppola"));
        biblioteca.add(new Pelicula("Jurassic Park", "Aventura", 127, "Steven Spielberg"));
        biblioteca.add(new Pelicula("Pulp Fiction", "Crimen", 154, "Quentin Tarantino"));

        // Nuevas películas añadidas
        biblioteca.add(new Pelicula("The Shawshank Redemption", "Drama", 142, "Frank Darabont"));
        biblioteca.add(new Pelicula("The Lion King", "Animación", 88, "Roger Allers, Rob Minkoff"));
        biblioteca.add(new Pelicula("The Avengers", "Acción", 143, "Joss Whedon"));
        biblioteca.add(new Pelicula("The Hunger Games", "Aventura", 142, "Gary Ross"));
        biblioteca.add(new Pelicula("Star Wars: Episode IV - A New Hope", "Ciencia ficción", 121, "George Lucas"));
        biblioteca.add(new Pelicula("The Silence of the Lambs", "Thriller", 118, "Jonathan Demme"));
        biblioteca.add(new Pelicula("Schindler's List", "Drama", 195, "Steven Spielberg"));
        biblioteca.add(new Pelicula("Fight Club", "Drama", 139, "David Fincher"));
        biblioteca.add(new Pelicula("The Prestige", "Suspenso", 130, "Christopher Nolan"));
        biblioteca.add(new Pelicula("La La Land", "Musical", 128, "Damien Chazelle"));

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
