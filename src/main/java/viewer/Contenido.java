package viewer;

public class Contenido {
    protected String titulo;
    protected String genero;
    protected int duracion; // Minutos
    protected boolean visto = false;

    public Contenido(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isVisto() {
        return visto;
    }

    public void marcarVisto() {
        this.visto = true;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + "...");
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Visto: " + (visto ? "Sí" : "No"));
    }
}
