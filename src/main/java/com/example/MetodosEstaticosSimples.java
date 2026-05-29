package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {

        System.out.println(
                String.format(
                        "%s",
                        "Este método fue declarado y llamado correctamente."
                )
        );
    }

    public static void ejemploPasoParametros(String nombre) {

        System.out.println("--------------------------------");
        System.out.println(
                String.format(
                        "Bienvenido, %s.",
                        nombre
                )
        );
    }

    public static int ejemploRetornoValores() {

        int numero1 = 10;
        int numero2 = 20;

        int suma = numero1 + numero2;
        System.out.println("--------------------------------");

        System.out.println(
                String.format(
                        "La suma de %d + %d es: %d",
                        numero1,
                        numero2,
                        suma
                )
        );

        return suma;
    }

    public static void ejemploSobrecarga() {

        System.out.println("--------------------------------");

        System.out.println(
                String.format(
                        "%s",
                        "Método ejecutado sin parámetros."
                )
        );
    }

    public static void ejemploSobrecarga(int n) {

        System.out.println("--------------------------------");

        System.out.println(
                String.format(
                        "Método ejecutado con el número: %d",
                        n
                )
        );
    }

}