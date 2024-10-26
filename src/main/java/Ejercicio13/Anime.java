package Ejercicio13;

public class Anime {
    String nombre;
    int episodios;
    String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Episodios: " + episodios);
        System.out.println("Género: " + genero);
    }
}
