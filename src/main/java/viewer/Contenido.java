package viewer.models;

public class Contenido {
    protected String titulo;
    protected int duracion;
    protected String categoria;

    public Contenido(String titulo, int duracion, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Categoría: " + categoria);
    }
}
