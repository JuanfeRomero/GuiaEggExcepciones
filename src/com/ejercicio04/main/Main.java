package com.ejercicio04.main;


import com.ejercicio04.excepciones.Excepcion;
import com.ejercicio04.excepciones.ExcepcionesAdivinar;

import java.util.Random;
import java.util.Scanner;

/*
* Escribir un programa en Java que juegue con el usuario a adivinar un número.*
* La computadora debe generar un número aleatorio entre 1 y 500 *, y el usuario tiene que  intentar  adivinarlo.*
* Para  ello,  cada  vez  que  el  usuario  introduce  un  valor,
* la computadora debe decirle al usuario
* si el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario.*
* Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla
* el número de veces que el usuario ha intentado adivinar  el  número. *
* Si  el  usuario  introduce  algo  que  no  es  un  número,
* se  debe controlar esa excepción e indicarlo por pantalla.
* En este último caso también se debe contar el carácter fallido como un intento
* */
public class Main {
    public static void main(String[] args) {

        System.out.println("*****************ADIVINAR EL NUMERO****************");

        final int LIMITE_MAXIMO = 500;
        final int LIMITE_MINIMO = 1;
        int numero = new Random().nextInt(LIMITE_MAXIMO-LIMITE_MINIMO) + LIMITE_MINIMO;
        int intentos = 0;
        boolean ganador = false;
        int adivina = 0;

        //System.out.println("El numero es: " + numero);

        do{
            // Cuantos intentos vamos
            System.out.println("Intento numero " + intentos);

            // Pide el numero
            System.out.println("Ingrese un numero para ver si le emboca");

            // Verifica que el input sea el correcto
            try {
                adivina = new ExcepcionesAdivinar().chequearNumero(LIMITE_MAXIMO, LIMITE_MINIMO);
            }catch (Excepcion e){
                System.out.println("Error.: " + e);
                System.out.println("Tipo de error:" + e.getMessage());
            }

            // Este chequea que el numero sea correcto, mayor o menor.
            if(adivina == numero){
                ganador = true;
            }else if(adivina < numero){
                System.out.println("El numero ingresado es menor");
            }else{
                System.out.println("El numero ingresado es mayor");
            }
            intentos++;
        }while (!ganador);


        System.out.println("Ha encontrado el numero correcto, le tomó " + intentos + " intentos");
    }
}
