package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Diga su nombre:");
        nombre = sc.nextLine();
        System.out.println("Hola "+nombre);
    }
}