package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        byte numeroByte = 127;
        short numeroShort = 32000;
        int numeroInt = 2147483647;
        long numeroLong = 9223372036854775807L;

        System.out.println(
                String.format("Byte: %d", numeroByte));

        System.out.println(
                String.format("Short: %d", numeroShort));

        System.out.println(
                String.format("Int: %d", numeroInt));

        System.out.println(
                String.format("Long: %d", numeroLong));

        System.out.println("--------------------------------");
    }

    public static void demostrarFlotantes() {
        float precioCafe = 4.5f;
        double precioComputador = 3500.99;

        System.out.println(
                String.format("Precio del café: %.1f", precioCafe));

        System.out.println(
                String.format("Precio del computador: %.2f", precioComputador));

        System.out.println("--------------------------------");
    }

    public static void demostrarCaracteres() {
        char inicial = 'L';

        System.out.println(
                String.format("Inicial del usuario: %c", inicial));

        System.out.println("--------------------------------");
    }

    public static void demostrarBooleanos() {
        boolean luzEncendida = true;
        System.out.println(
                String.format("¿La luz está encendida?: %b", luzEncendida));
        System.out.println("--------------------------------");
    }

    public static void demostrarValoresPorDefecto() {
        // Las variables locales deben inicializarse antes de usarse.
        // int numero;
        // System.out.println(numero);

        System.out.println(
                String.format(
                        "%s",
                        "Las variables locales no tienen valores por defecto."));
    }
}