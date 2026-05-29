package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int numeroEntero = 25;
        double numeroDouble = numeroEntero;

        System.out.println("Casting implícito");

        System.out.println(
                String.format("Valor entero: %d", numeroEntero));

        System.out.println(
                String.format("Valor convertido a double: %.1f", numeroDouble));

        System.out.println("--------------------------------");
    }

    public static void demostrarCastingExplicito() {
        double precio = 19.99;
        int precioEntero = (int) precio;

        System.out.println("Casting explícito");

        System.out.println(
                String.format("Double original: %.2f", precio));

        System.out.println(
                String.format("Int convertido: %d", precioEntero));

        System.out.println(
                String.format(
                        "%s",
                        "Los decimales se perdieron durante la conversión."));

        System.out.println("--------------------------------");
    }

    public static void demostrarProblemasDePrecision() {
        long numeroGrande = 130000;
        short numeroShort = (short) numeroGrande;

        System.out.println(
                String.format("Long original: %d", numeroGrande));

        System.out.println(
                String.format("Short convertido: %d", numeroShort));

        System.out.println(
                String.format(
                        "%s",
                        "Ocurrió overflow porque el valor excede el límite de short."));
    }
}