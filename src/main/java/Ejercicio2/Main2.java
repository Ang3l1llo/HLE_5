package Ejercicio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");

    }
}