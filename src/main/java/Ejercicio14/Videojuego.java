package Ejercicio14;

public class Videojuego {
    String titulo;
    String plataforma;
    int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Horas Jugadas: " + horasJugadas);
    }
}
