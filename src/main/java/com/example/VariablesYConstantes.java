package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {
        int edad = 19;
        double estatura = 1.82;
        System.out.println(String.format("Tengo %d años y mido %f cm", edad, estatura));
    }

    public static void demostrarConvencionesNombres() {
        int puntuacionMaximaJuego = 1000;
        String nombreCompletoUsuario = "Luis Alejandro Londoño Valle";

        System.out.println(
                String.format(
                        "Puntuación máxima del juego: %d",
                        puntuacionMaximaJuego));

        System.out.println(
                String.format(
                        "Nombre completo del usuario: %s",
                        nombreCompletoUsuario));
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;

        System.out.println(
                String.format("Valor constante de PI: %.4f", PI));

    
        // PI = 5.0;
    }
}