package com.ejercicio02.main;

import com.ejercicio02.arrayclass.ArrayClass;

import java.util.Arrays;


/*
* Definir  una  Clase  que  contenga  algún  tipo  de  dato  de  tipo  array  y  agregue  el
* código para generar y capturar una excepción ArrayIndexOutOfBoundsException
* (índice de arreglo fuera de rango).
* */
public class Main {
    public static void main(String[] args) {
        ArrayClass arrays = new ArrayClass(3, 9);

        for (int i = 0; i < arrays.getIntArray().length; i++) {
            try {
                System.out.println("Estoy en el lugar: " + i);
                arrays.getStringArray()[i] = Integer.toString(i);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Uno de los arrays quizo superar su limite");
                System.out.println("Datos de la excepcion: " + e);
            }finally {
                arrays.getIntArray()[i] = i;
            }
        }
        System.out.println(arrays);
    }
}
