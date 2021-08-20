package com.ejercicio03.main;


import com.ejercicio03.divisionnumero.DivisionNumero;

import java.util.Scanner;

/*
* Defina una clase llamada DivisionNumero (done). En el método main utilice un Scanner
* para  leer  dos  números  en  forma  de  cadena.  (done)
* A  continuación,  utilice  el  método parseInt() de la clase Integer,
* para convertir las cadenas al tipo int y guardarlas en dos  variables  de  tipo  int (done).
* Por  ultimo  realizar  una  división  con  los  dos  numeros  y mostrar el resultado.
* Todas  estas  operaciones  puede  tirar  excepciones  a  manejar,
* el  ingreso por teclado puede causar una excepción de tipo InputMismatchException,
* el método Integer.parseInt() si la cadena no puede convertirse a entero,
* arroja una NumberFormatException  y  además,
* al  dividir  un  número  por  cero  surge  una ArithmeticException.
* Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primero = 0, segundo = 0;

        System.out.println("Ingrese dos numeros:");
        try {
            primero = Integer.parseInt(sc.nextLine());
            segundo = Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error encontrado:");
            System.out.println("Datos: " + e);
            System.out.println("Mensaje: " + e.getMessage());
        }

        DivisionNumero divid = new DivisionNumero(primero, segundo);

        try{
            System.out.println(divid.dividir());
        }catch(ArithmeticException e){
            System.out.println("Error: " + e);
            System.out.println(e.getMessage());
        }

    }
}
