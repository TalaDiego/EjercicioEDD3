package com.mycompany.ejercicioedd3;

import java.util.Scanner;

/**
 * Calculate the area of an isosceles triangle.
 *
 * @author Diego Castaño Freile
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("¿Cual es el area del triangulo?");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());

        System.out.println("¿Cual es la base del triangulo?");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());

        float area = triangle.calculateArea();
        System.out.println("El area del triangulo es: " + area);

        float fixedHeight = 5;
        float fixedBase = 4;

        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El area del triangulo fijado es: " + fixedTriangle.calculateArea());

    }
// Shift + Alt + F (corrects line placement)
}
// Este comentario es una prueba.