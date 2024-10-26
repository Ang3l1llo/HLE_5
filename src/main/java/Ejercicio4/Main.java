package Ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.println("Adivina el número (entre 1 y 100):");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}