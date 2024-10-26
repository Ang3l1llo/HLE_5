package Ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Videojuego> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Eliminar videojuego");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); // para consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el título:");
                    String titulo = scanner.nextLine();

                    System.out.println("Introduce la plataforma:");
                    String plataforma = scanner.nextLine();

                    System.out.println("Introduce las horas jugadas:");
                    int horas = scanner.nextInt();

                    Videojuego nuevoVideojuego = new Videojuego(titulo, plataforma, horas);
                    inventario.add(nuevoVideojuego);
                    break;

                case 2:
                    System.out.println("Introduce el título del videojuego a eliminar:");
                    String tituloEliminar = scanner.nextLine();
                    inventario.removeIf(v -> v.titulo.equalsIgnoreCase(tituloEliminar));
                    break;

                case 3:
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        for (Videojuego videojuego : inventario) {
                            videojuego.mostrarInfo();
                            System.out.println();
                        }
                    }
                    break;
            }
        } while (opcion != 4);
    }
}