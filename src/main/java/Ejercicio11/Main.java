package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de términos de la secuencia Fibonacci:");
        int n = scanner.nextInt();

        int a = 0, b = 1, siguiente;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}