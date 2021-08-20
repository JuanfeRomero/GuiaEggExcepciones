package com.ejercicio04.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesAdivinar {

    public int chequearNumero(int LIMITE_MAXIMO, int LIMITE_MINIMO) throws Excepcion{
        try{
            int num = new Scanner(System.in).nextInt();
            if(num > LIMITE_MAXIMO){
                throw new Excepcion("El numero no puede ser mayor a " + LIMITE_MAXIMO);
            }
            if(num < LIMITE_MINIMO){
                throw new Excepcion("El numero no puede ser menor a " + LIMITE_MINIMO);
            }
            return num;
        }catch (NullPointerException e){
            throw new Excepcion("El valor esta vacío");
        } catch (InputMismatchException e){
            throw new Excepcion("El tipo de valor ingresado es incorrecto");
        }
    }
}
