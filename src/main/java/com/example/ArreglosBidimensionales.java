package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {

        int[][] matriz = {
                {1, 2},
                {3, 4}
        };

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(
                        String.format("%d ", matriz[fila][columna])
                );
            }

            System.out.println();
        }
    }

    public static void recorrerMatriz() {

        int[][] matriz = {
                {5, 10, 15},
                {20, 25, 30}
        };

        System.out.println("--------------------------------");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.println(
                        String.format(
                                "Posición [%d][%d] = %d",
                                fila,
                                columna,
                                matriz[fila][columna]
                        )
                );
            }
        }
    }

    public static void ejemploUsosTipicos() {

        String[][] estudiantes = {
                {"Luis", "Aprobado"},
                {"Ana", "Reprobado"},
                {"Carlos", "Aprobado"}
        };

        System.out.println("--------------------------------");

        for (int fila = 0; fila < estudiantes.length; fila++) {

            System.out.println(
                    String.format(
                            "Estudiante: %s | Estado: %s",
                            estudiantes[fila][0],
                            estudiantes[fila][1]
                    )
            );
        }
    }
}