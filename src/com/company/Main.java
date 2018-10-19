package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static String comprobarMultiplos(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if ((primerNumero % segundoNumero == 0) || (segundoNumero % primerNumero == 0)) {
            cadenaResultado = "Los números SÍ son múltiplos.";
        } else {
            cadenaResultado = "Los números NO son múltiplos.";
        }
        return cadenaResultado;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a comprobar si un número es múltiplo de otro!");
        System.out.print("Introduce un primer número: ");
        primerNumero = (int)validador(0);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = (int)validador(0);
        sc.close();
        System.out.println(comprobarMultiplos(primerNumero, segundoNumero));
    }
}
