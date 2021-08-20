package com.ejercicio01.main;

import com.ejercicio01.Persona.Persona;
import com.ejercicio01.Persona.PersonaService;

/*
* Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
* de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
* código con una cláusula try-catch para probar la nueva excepción que debe ser controlada
* */
public class Main {
    public static void main(String[] args) {
        /*
        Creé un modulo de la guia de objetos y lo importe al projecto actual,
        quizas difiera segun el ide como se hace eso y tendria que importar todos los ejercicios solo para usar uno, así que lo termine copiando y pegando
        */
        Persona persona1 = null;
        PersonaService service = new PersonaService();

/*
        service.esMayorDeEdad(persona1);
*/
        try {
            service.esMayorDeEdad(persona1);
        }catch (NullPointerException e){
            System.out.println("Error encontrad: " + e);
            System.out.println("Mensaje: " + e.getMessage());
        }finally {
            System.out.println("Igual siguió ejecutando esto");
        }
    }
}
