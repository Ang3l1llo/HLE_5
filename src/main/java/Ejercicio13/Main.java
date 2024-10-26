package Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del anime:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el número de episodios:");
        int episodios = scanner.nextInt();

        scanner.nextLine(); // consumir la nueva línea

        System.out.println("Introduce el género:");
        String genero = scanner.nextLine();

        Anime anime = new Anime(nombre, episodios, genero);
        anime.mostrarInfo();
    }
}