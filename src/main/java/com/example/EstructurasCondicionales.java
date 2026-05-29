package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {

        int edad = 20;

        if (edad >= 18) {

            System.out.println(
                    String.format(
                            "La persona tiene %d años y es mayor de edad.",
                            edad
                    )
            );
        }
    }

    public static void ejemploIfElse() {

        int edad = 16;

        System.out.println("--------------------------------");

        if (edad >= 18) {

            System.out.println(
                    String.format(
                            "La persona tiene %d años y puede votar.",
                            edad
                    )
            );

        } else {

            System.out.println(
                    String.format(
                            "La persona tiene %d años y NO puede votar.",
                            edad
                    )
            );
        }
    }

    public static void ejemploIfElseIfElse() {

        int nota = 4;

        System.out.println("--------------------------------");

        if (nota >= 5) {

            System.out.println(
                    String.format("La nota %d es Excelente.", nota)
            );

        } else if (nota >= 3) {

            System.out.println(
                    String.format("La nota %d es Aprobatoria.", nota)
            );

        } else {

            System.out.println(
                    String.format("La nota %d es Reprobatoria.", nota)
            );
        }
    }

    public static void ejemploSwitch() {

        int dia = 3;
        String nombreDia;

        switch (dia) {

            case 1:
                nombreDia = "Lunes";
                break;

            case 2:
                nombreDia = "Martes";
                break;

            case 3:
                nombreDia = "Miércoles";
                break;

            case 4:
                nombreDia = "Jueves";
                break;

            case 5:
                nombreDia = "Viernes";
                break;

            case 6:
                nombreDia = "Sábado";
                break;

            case 7:
                nombreDia = "Domingo";
                break;

            default:
                nombreDia = "Número inválido";
        }

        System.out.println("--------------------------------");

        System.out.println(
                String.format(
                        "El día correspondiente es: %s",
                        nombreDia
                )
        );
    }

    public static void ejemploSwitchExpression() {

        String estacion = "VERANO";

        String actividad = switch (estacion) {

            case "PRIMAVERA" -> "Salir al parque";
            case "VERANO" -> "Ir a la playa";
            case "OTOÑO" -> "Tomar chocolate caliente";
            case "INVIERNO" -> "Usar chaqueta";

            default -> "Estación inválida";
        };

        System.out.println("--------------------------------");

        System.out.println(
                String.format(
                        "En %s se recomienda: %s",
                        estacion,
                        actividad
                )
        );
    }

  
}