package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int numero : numeros) {

            System.out.println(
                    String.format("Número: %d", numero));
        }
    }

    public static void mostrarLongitud() {

        String[] nombres = {
                "Ana",
                "Carlos",
                "Luis",
                "María"
        };

        System.out.println("--------------------------------");
        System.out.println(
                String.format(
                        "La longitud del arreglo es: %d",
                        nombres.length));
    }

    public static void recorrerConForClasico() {

        int[] edades = { 18, 20, 25, 30 };

        System.out.println("--------------------------------");

        for (int i = 0; i < edades.length; i++) {

            System.out.println(
                    String.format(
                            "Posición %d -> %d años",
                            i,
                            edades[i]));
        }
    }

    public static void recorrerConForEach() {

        String[] peliculas = {
                "Interstellar",
                "Batman",
                "Cars",
                "Shrek"
        };

        System.out.println("--------------------------------");

        for (String pelicula : peliculas) {

            System.out.println(
                    String.format(
                            "Película favorita: %s",
                            pelicula));
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {

        int[] invertido = new int[array.length];

        int indice = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            invertido[indice] = array[i];
            indice++;
        }

        System.out.println("--------------------------------");
        System.out.println("Arreglo Original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(
                    String.format("%d", array[i]));
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Arreglo Invertido:");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(
                    String.format("%d", invertido[i]));
            if (i < invertido.length - 1) {
                System.out.print(",");
            }
        }

        return invertido;
    }
}