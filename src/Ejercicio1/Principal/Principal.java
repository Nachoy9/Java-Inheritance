/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */


package Ejercicio1.Principal;

import Ejercicio1.Entidades.*;

public class Principal {

    public static void main(String[] args) {

        Animal bimba = new Perro("Bimba","Pastillas","Labradoodle",2);
        Animal argos = new Perro("Argos","Pastillas","Cruza",12);
        Animal solito = new Caballo("Solito","Alfalfa","Tordillo",5);
        Animal candela = new Gato("Candela","Carne","Cruza",13);

        bimba.alimento();
        argos.alimento();
        solito.alimento();
        candela.alimento();

    }
}
