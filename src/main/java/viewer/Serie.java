package viewer.models;

public class Serie extends Contenido {

    private int temporadas;

    public Serie(String titulo, int duracion, String categoria, int temporadas) {
        super(titulo, duracion, categoria);
        this.temporadas = temporadas;
    }
}
