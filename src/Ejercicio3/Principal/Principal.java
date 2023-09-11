/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */

package Ejercicio3.Principal;

import Ejercicio2.Entidades.Electrodomestico;
import Ejercicio2.Servicios.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    private static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

    public static void main(String[] args) {

        LavadoraServicio lavSer = new LavadoraServicio();
        TvServicio tvSer = new TvServicio();

        int suma = 0;

        System.out.println("Cargando electrodomesticos");

        electrodomesticos.add(tvSer.generarTelevisor(1000,15,"Rojo","B",20,true));
        electrodomesticos.add(tvSer.generarTelevisor(1250,25,"Azul","A",36,false));
        electrodomesticos.add(lavSer.generarLavadora(2000,45,"Amarillo","F",25));
        electrodomesticos.add(lavSer.generarLavadora(3000,60,"Violeta","C",30));

        for (Electrodomestico electrodomestico: electrodomesticos) {

            System.out.println("El precio del electrodomestico Nro " + (electrodomesticos.indexOf(electrodomestico)+1) + " es: $ " + electrodomestico.getPrecio());

            suma += electrodomestico.getPrecio();

        }

        System.out.println("La suma del precio de todos los electrodomesticos es: $ " + suma);







    }

}
