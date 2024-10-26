package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();

        String reverso = new StringBuilder(cadena).reverse().toString();
        System.out.println("La cadena al revés es: " + reverso);
    }
}