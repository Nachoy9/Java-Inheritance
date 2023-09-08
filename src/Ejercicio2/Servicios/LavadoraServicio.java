package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Lavadora;

import java.util.ArrayList;
import java.util.Scanner;

public final class LavadoraServicio extends ElectrodomesticoServicio {

    public ArrayList<Lavadora> lavadoras = new ArrayList<>();

    public void crearLavadora(Scanner input) {

        Lavadora lavadora = new Lavadora();

        super.crearElectrodomestico(input, lavadora);

        System.out.println("Ingrese Carga:");
        double carga = input.nextDouble();
        input.nextLine();

        lavadora.setCarga(carga);
        lavadora.setPrecio(_precioFinal(lavadora));

        lavadoras.add(lavadora);

    }

    public double _precioFinal(Lavadora lavadora) {

        if (lavadora.getCarga() > 30) {
            return (lavadora.getPrecio() + super.precioFinal(lavadora) + 500);
        }

        return (lavadora.getPrecio() + super.precioFinal(lavadora));

    }

    public void mostrarLavadoras() {

        for (Lavadora lavadora : lavadoras) {
            System.out.println(lavadora.toString());
        }
    }

}
