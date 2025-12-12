package viewer;

public class Pelicula extends Contenido {

    private String director;

    public Pelicula(String titulo, String genero, int duracion, String director) {
        super(titulo, genero, duracion);
        this.director = director;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Película ===");
        super.mostrarInfo();
        System.out.println("Director: " + director);
    }
}
