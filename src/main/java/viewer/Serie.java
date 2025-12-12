package viewer;

public class Serie extends Contenido {

    private int temporadas;

    public Serie(String titulo, String genero, int duracion, int temporadas) {
        super(titulo, genero, duracion);
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Serie ===");
        super.mostrarInfo();
        System.out.println("Temporadas: " + temporadas);
    }
}
