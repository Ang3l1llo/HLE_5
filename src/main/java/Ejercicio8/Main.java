package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine().toLowerCase();

        int contadorVocales = 0;
        for (char c : frase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contadorVocales++;
            }
        }

        System.out.println("La frase contiene " + contadorVocales + " vocales.");
    }
}