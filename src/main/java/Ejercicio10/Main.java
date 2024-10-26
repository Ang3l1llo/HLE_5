package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("¿Es Celsius o Fahrenheit? (C/F)");
        String tipo = scanner.next().toUpperCase();

        if (tipo.equals("C")) {
            double fahrenheit = temperatura * 9/5 + 32;
            System.out.println(temperatura + "°C son " + fahrenheit + "°F.");
        } else if (tipo.equals("F")) {
            double celsius = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F son " + celsius + "°C.");
        } else {
            System.out.println("Unidad de temperatura demasiado calentita");
        }
    }
}