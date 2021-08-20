package com.ejercicio03.divisionnumero;

public class DivisionNumero {
    int primero;
    int segundo;

    public DivisionNumero(int primero, int segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public double dividir() throws ArithmeticException{
        if(segundo == 0){
            throw new ArithmeticException("Intentó dividir por cero");
        }
        return (double)primero/segundo;
    }
}
