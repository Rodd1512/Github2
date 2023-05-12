package sencillo;

import java.util.Scanner;

public class Sencillo {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        int suma = num + 5;
        int division = num / 2;
        int cuadrado = num * num;
        System.out.println("El número ingresado es: " + num);
        System.out.println("El resultado de sumar 5 al número es: " + suma);
        System.out.println("El resultado de dividir el número entre 2 es: " + division);
        System.out.println("El resultado de elevar el número al cuadrado es: " + cuadrado);
        System.out.println("HolaMundo");
        System.out.println("Este es el resultado de" + cuadrado);
        scanner.close();
    }
}
