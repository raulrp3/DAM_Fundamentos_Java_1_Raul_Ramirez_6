package com.company;

import java.util.Scanner;

public class Main {
    public static int validarNumero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
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
        primerNumero = validarNumero(sc);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = validarNumero(sc);
        sc.close();
        System.out.println(comprobarMultiplos(primerNumero,segundoNumero));
    }
}
