package com.ejercicio01.Persona;

import java.util.Scanner;

public class PersonaService {
    private final Scanner sc = new Scanner(System.in);

    public void crearPersona(Persona persona){
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(sc.nextInt());
        sc.nextLine();

        char sexo;
        do{
            System.out.println("Ingrese la letra correspondiente al sexo de la persona\n'H' - Hombre\n'M' - Mujer\n'O' - Otro");
            sexo = sc.nextLine().toUpperCase().charAt(0);
            if(sexo != 'H' && sexo != 'M' && sexo != 'O') System.out.println("Incorrecto, elija una de las opciones correctas");

        }while(sexo != 'H' && sexo != 'M' && sexo != 'O');
        persona.setSexo(sexo);

        System.out.println("Ingrese el peso de " + persona.getNombre());
        persona.setPeso(sc.nextDouble());

        System.out.println("Ingrese la altura de " + persona.getNombre());
        persona.setAltura(sc.nextDouble());
    }

    public int calcularIMC(Persona persona){
        double imc = persona.getPeso()/Math.pow(persona.getAltura(), 2);

        final int MENORA20 = -1;
        final int ENTRE20y25 = 0;
        final int MAYORA25 = 1;

        return imc < 20? MENORA20: imc <= 25? ENTRE20y25: MAYORA25;
        /*
        if(imc < 20){
            return MENORA20;
        }else if(imc <= 25){
            return ENTRE20y25;
        }else{
            return MAYORA25;
        }*/
    }

    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >= 18;
    }
}
