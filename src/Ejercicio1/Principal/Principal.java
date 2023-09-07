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
