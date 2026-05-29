package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {

        double nota1 = 4.5;
        double nota2 = 3.8;
        double nota3 = 4.2;

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println(
                String.format("Nota 1: %.1f", nota1));

        System.out.println(
                String.format("Nota 2: %.1f", nota2));

        System.out.println(
                String.format("Nota 3: %.1f", nota3));

        System.out.println(
                String.format("Promedio final: %.2f", promedio));
        System.out.println("--------------------------------");

    }

    public static void demostrarIncrementoDecremento() {

        int contador = 5;

        System.out.println(
                String.format("Valor inicial: %d", contador));

        System.out.println(
                String.format("Post-incremento: %d", contador++));

        System.out.println(
                String.format(
                        "Valor después de contador++: %d",
                        contador));

        System.out.println(
                String.format("Pre-incremento: %d", ++contador));

        contador--;

        System.out.println(
                String.format("Después de contador--: %d", contador));
        System.out.println("--------------------------------");

    }

    public static void demostrarRelacionales() {

        int numero1 = 10;
        int numero2 = 20;

        System.out.println(
                String.format(
                        "%d es mayor que %d: %b",
                        numero1,
                        numero2,
                        numero1 > numero2));

        System.out.println(
                String.format(
                        "%d es menor que %d: %b",
                        numero1,
                        numero2,
                        numero1 < numero2));

        System.out.println(
                String.format(
                        "%d es igual a %d: %b",
                        numero1,
                        numero2,
                        numero1 == numero2));

        System.out.println("--------------------------------");

    }

    public static void demostrarLogicos() {

        int numero = 25;

        boolean resultado = numero > 10 && numero < 50;

        System.out.println(
                String.format(
                        "¿El número %d es mayor que 10 y menor que 50?: %b",
                        numero,
                        resultado));

        System.out.println("--------------------------------");

    }

    public static void demostrarAsignacionCompuesta() {

        int puntos = 100;

        System.out.println(
                String.format("Puntos iniciales: %d", puntos));

        puntos += 50;

        System.out.println(
                String.format("Después de += 50: %d", puntos));

        puntos *= 2;

        System.out.println(
                String.format("Después de *= 2: %d", puntos));

        System.out.println("--------------------------------");

    }

    public static void demostrarOperadorTernario() {

        int valor = -8;

        String mensaje = (valor >= 0)
                ? "Positivo"
                : "Negativo";

        System.out.println(
                String.format(
                        "El número %d es: %s",
                        valor,
                        mensaje));
        System.out.println("--------------------------------");

    }
}